//insert the package statement here please

public class PrimeNumbers {
    public static void main (String[] args)
    {
        long startTime, endTime, totalTime; //Track the run time of each method
        startTime = System.currentTimeMillis();

        int Range = 50; // Output the prime numbers in [2,50]
        // Run each method according to argument
        if(Integer.parseInt(args[0].trim()) == 0)
            BasicWay(Range);
        else
            AdvancedWay(Range);

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
        int Counter =0; // the number of prime numbers found so far
        int Num = 2; //Start to search prime numbers from 2

        while ( Num < Range) //The program will finish upon search through the range
        {
            for() //Loop to see whether the number is Prime number
            {
                /* In case that prime number is found
                // Counter++;
                // System.out.printf("%d", Num);
                */
            }

            if(Counter%5 == 0)
                //Print Enter
                Num++; // Verify the next number is prime or not
        }

    }

    /*
       Exercise#2: Advanced Way
        */
    public static void AdvancedWay(int Range){
        int Counter =0; // the number of prime numbers found so far
        int Num = 2; //Start to search prime numbers from 2

        //By default, assume all integers are prime
        boolean[] isPrime = new boolean[Range+1];
        for (int i = 2; i <= Range; i++) {
            isPrime[i] = true;
        }
        //Mark non-primes iteratively
        for (){

        }
        //Output the Primes in 5-per-line format
        for(){

        }

    }
}
