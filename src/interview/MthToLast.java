package interview;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kasun on 12/4/16.
 */
public class MthToLast {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value = Integer.valueOf(scanner.nextInt());

        List<BigInteger> numbers = new ArrayList<>();

        while (scanner.hasNextInt()) {
            numbers.add(BigInteger.valueOf(scanner.nextInt()));
        }

        if (numbers.size() < value) {
            System.out.println("NIL");

        } else {
            int counter = numbers.size();

            for (int i = 0; i < numbers.size(); i++) {
                counter--;

                if (i == value) {
                    System.out.println(numbers.get(counter + 1));
                }
            }
        }
    }
}
