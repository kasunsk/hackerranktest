package interview;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by kasun on 12/4/16.
 */
public class Fibonacci {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.next();
            BigInteger result = fibonacci(BigInteger.ZERO, BigInteger.ONE, BigInteger.valueOf(Long.parseLong(input)));
            System.out.println(result);
        }
    }


    public static BigInteger fibonacci(BigInteger firstValue, BigInteger secondValue, BigInteger value) {

        if (value.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;
        }

        if (value.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            return firstValue.add(fibonacci(secondValue, firstValue.add(secondValue), value.subtract(BigInteger.ONE)));
        }
    }
}
