/**
 * Created by Isaac on 11/27/16.
 */
public class WithdrawerDepositor {
    public static void main(String[] args) {
        BankAccount2 ba = new BankAccount2(0); // initialize the bank account to have balance 0
        Thread withdrawer = new Thread(new Withdrawer(ba, 3));
        Thread depositor = new Thread(new Depositor(ba, 5));
        withdrawer.start();
        depositor.start();
        try {
            withdrawer.join();
            depositor.join();
        }
        catch(InterruptedException e){}
        System.out.println(ba.getBalance());
    }
}
