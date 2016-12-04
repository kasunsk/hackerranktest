package interview;

import designpatterns.interceptinFilter.InterceptingFilterDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kasun on 12/3/16.
 */
public class CoinChange {

    public static void main(String[] args) {

       // Scanner scannerOne = new Scanner(System.in);

//        System.out.println("In 1 " + scannerOne.next());
//
//        int value = Integer.parseInt(scannerOne.next());
//
//        List<Integer> list = new ArrayList<>();
//
//        while (scannerOne.hasNextInt()) {
//            list.add(scannerOne.nextInt());
//        }

        int value = 50;

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);

        int counter = 0;

        for (int i = 0; i < list.size(); i++) {

            int start = list.get(i);

            for (int j = i; j < list.size() - 1; j++) {

                if (start + list.get(j) == value ){
                    counter++;
                }
            }
        }

        System.out.println("Count " + counter);
    }
}
