package algorithms1;
import java.util.Scanner;
import java.util.Random;

public class Algorithms {
    Scanner myScanner = new Scanner(System.in);

    public boolean ricePack(int smallBag, int bigBag, int goal) {
        if (smallBag < 0 || bigBag < 0 || goal < 0) {
            return false;
        }
        int x = smallBag;
        int y = bigBag * 5;
        if (x + y == goal || (x + y > goal && y < goal))
            return true;
        else
            return false;

    }

    public long largestPrimeFactor() {
        System.out.println("Please enter the number: ");
        long number = myScanner.nextInt();
        long largestPrime = -5;


        if (number % 2 == 0) {
            largestPrime = 2;
            while (number % 2 == 0) {
                number = number / 2;
            }
        }
        for (long i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number = number / i;
            }
        }

        if (number > 2)
            largestPrime = number;

        return largestPrime;
    }

    void odd_even() {
        Random rand = new Random();
        int rand_numb = rand.nextInt(1, 100);
        System.out.println("The random number between 1 to 100 is: " + rand_numb);
        if (rand_numb == 0)
            System.out.println("0 is neither odd nor even");
        else if (rand_numb % 2 == 0)
            System.out.println("The given number is even.");
        else
            System.out.println("The given number is odd.");

    }

    public void max_min_Rand() {
        Random rand = new Random();
        int count = 1;
        int maxNumb = 1;
        int minNumb = 100;
        while (count < 11) {
            int randNumb = rand.nextInt(1, 100);
            if (randNumb < minNumb)
                minNumb = randNumb;
            if (randNumb > maxNumb)
                maxNumb = randNumb;
            count++;
            System.out.print(randNumb + " ");
        }
        System.out.println("\nThe largest random between numbers is: " + maxNumb);
        System.out.println("The smallest random between numbers is: " + minNumb);
    }
}

