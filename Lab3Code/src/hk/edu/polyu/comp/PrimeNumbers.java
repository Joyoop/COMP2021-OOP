/**
 * Created by Isaac Shi on 2016/9/19.
 */

package hk.edu.polyu.comp;

public class PrimeNumbers {
    public static void main (String[] args)
    {
        long startTime, endTime, totalTime; //Track the run time of each method
        startTime = System.currentTimeMillis();

        int Range = 50; // Output the prime numbers in [2,50]
        // Run each method according to argument
        if(Integer.parseInt(args[0].trim()) == 0) {
            BasicWay(Range);
            System.out.println("This is the Basic Way");
        } else {
            AdvancedWay(Range);
            System.out.println("you smart ass");
        }


        endTime   = System.currentTimeMillis();
        totalTime = endTime - startTime; //Run time of the program
        System.out.printf("Run time is %d", totalTime);
    }


    //Complete the code below
    //You may re-organise the code

    /*
       Exercise#1: Basic Way
        */
    public static void BasicWay(int Range) {
        int Counter = 0; // the number of prime numbers found so far
        int Num = 2; //Start to search prime numbers from 2

        while (Num < Range) //The program will finish upon search through the range
        {
            Boolean isPrime = true;

            for (int i = 2; i < Num; i++) {

                if (Num % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                if(Counter == 5){
                    System.out.println();
                    Counter = 0;
                }
                Counter++;
                System.out.printf("%d ", Num);

            }

            Num++;
        }
    }

    /*
       Exercise#2: Advanced Way
        */
    public static void AdvancedWay(int Range){
        int Counter = 0; // the number of prime numbers found so far
        int Num = 2; //Start to search prime numbers from 2

        //By default, assume all integers are prime
        boolean[] isPrime = new boolean[Range+1];
        for (int i = 2; i <= Range; i++) {
            isPrime[i] = true;
        }

        while(Num <= Range){
            //Mark non-primes iteratively
            if (isPrime[Num]) {
                for (int j = 2; j * Num <= Range; j++)
                    isPrime[Num * j] = false;
            }

            if(isPrime[Num]) {
                if(Counter == 5) {
                    System.out.println();
                    Counter = 0;
                }
                Counter++;
                System.out.printf("%d ", Num);
            }
            Num++;
        }


    }
}
