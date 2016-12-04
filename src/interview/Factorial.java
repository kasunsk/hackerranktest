package interview;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by kasun on 12/1/16.
 */
public class Factorial {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        BigInteger number = BigInteger.valueOf(Long.parseLong(scanner.next()));

        BigInteger result = calculateFactorial(number);
        System.out.println(result);
    }

    private static BigInteger calculateFactorial2(BigInteger number) {

        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= number.intValue(); i++)
            fact = fact.multiply(BigInteger.valueOf(i));

        return fact;
    }

    private static BigInteger calculateFactorial(BigInteger number) {

        if (number.equals(BigInteger.ZERO)){
            return BigInteger.ONE;
        } else {
            return number.multiply(calculateFactorial(number.subtract(BigInteger.ONE)));
        }
    }

    public static void main(String args) {

        int n = 6;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (n - i > j + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    static int sum(int[] numbers) {

        int loopSize = numbers[0];
        int sum = 0;

        for ( int i = 1; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
}

