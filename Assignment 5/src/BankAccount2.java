/**
 * Created by Isaac on 11/30/16.
 */
import java.util.concurrent.locks.*;
public class BankAccount2 {
    private int balance;
    private final ReentrantLock lock = new ReentrantLock();
    public BankAccount2(int balance){
        this.balance = balance;
    }

    public void deposit(int amount){
        lock.lock();
        try {
            this.balance += amount;
        }finally {
            lock.unlock();
        }
    }

    public void withdraw(int amount){

        lock.lock();
        try {
                while(amount == 0) {
                    Thread.yield();
                }
                this.balance -= amount;
            } finally {
                lock.unlock();
            }
    }

    public int getBalance(){
        return balance;
    }
}
