package interview;

/**
 * Created by kasun on 12/5/16.
 */
public class CardGame {

    public static void main(String args []) {

        int input = 7;

        String result = findWinner(input);
        System.out.println(result);
    }

    private static String findWinner(int input) {

        if (input % 2 == 0 || input % 3 == 0 || input % 5 == 0) {
            return "First";
        } else {
            return "Second";
        }
    }
}
