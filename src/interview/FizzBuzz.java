package interview;

import java.util.Scanner;

/**
 * Created by kasun Kariyawasam on 12/4/16.
 */
public class FizzBuzz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.next());

        for (int value = 1; value <= input; value++) {
            System.out.println(isFizzBuzz(value));
        }
    }

    private static String isFizzBuzz(int value) {

        if (value % 3 == 0 && value % 5 == 0)
            return "FizzBuzz";
        else if (value % 3 == 0) {
            return "Fizz";
        } else if (value % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(value);
        }
    }
}
