/**
 * Created by Isaac on 11/27/16.
 */
public class Withdrawer implements Runnable{
    private BankAccount2 ba;
    private int amount;
    public Withdrawer(BankAccount2 ba, int amount){
        this.ba = ba;
        this.amount = amount;
    }
    public void run() {
        for (int i = 0; i < 10; i++){
            ba.withdraw(amount); // Note that a withdraw is only allowed when the
            // balance is greater than the amount to withdraw
           //System.out.print(ba.getBalance());
        }
    }
}
