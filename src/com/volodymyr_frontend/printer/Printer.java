package com.volodymyr_frontend.printer;

import java.util.ArrayList;

public class Printer {

    public static void printArrayList(String title, ArrayList<Float> list) {
        System.out.println(title);
        list.forEach(System.out::println);
    }

    public static void printMiddleRowValues(float[] middles) {
        System.out.println("\nMiddle rows negative values:");

        for (int row = 0; row < middles.length; row++) {
            System.out.println("Row " + row + ": " + middles[row]);
        }
    }
}
