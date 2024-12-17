
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Sample {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible by any number other than 1 and itself, not prime
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Print prime numbers between 0 and 200
        System.out.println("Prime numbers between 0 and 200:");
        for (int i = 0; i <= 200; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

