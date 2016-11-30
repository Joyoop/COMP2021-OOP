/**
 * Created by Isaac on 11/27/16.
 */
public class BankAccount {
    private int balance;

    public BankAccount(int balance){
        this.balance = balance;
    }

    public synchronized void deposit(int amount){
            this.balance += amount;
            notifyAll();
    }

    public synchronized void withdraw(int amount){
        try{
            while(amount == 0) {
                wait();
            }
            this.balance -= amount;
            notifyAll();
        }catch(InterruptedException e){

        }
    }

    public int getBalance(){
        return balance;
    }
}
