package sampleTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kasun on 12/11/16.
 */
public class StaticInitializerBlock {

    public static boolean flag;
    public static int B;
    public static int H;

    static {

        Scanner scanner = new Scanner(System.in);

        List<Integer> values = new ArrayList<>(2);

        while (scanner.hasNext()) {
            values.add(Integer.parseInt(scanner.next()));
        }
        B = values.get(0);
        H = values.get(1);

        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            flag = true;
        }
    }

    public static void main(String[] args) {

        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}
