package com.volodymyr_frontend;

import com.volodymyr_frontend.matrix.Matrix;
import com.volodymyr_frontend.printer.Printer;
import com.volodymyr_frontend.tabulation.Tabulation;

public class Main {
    private static final int N = 4;

    public static void main(String[] args) {
        // Task 1
        System.out.println("Task #1 \n");

        Tabulation firstTabulator = new Tabulation(-3, 3, 0.3F);

        FunctionCalculator firstCalculator = x -> (float) ((x + 2) * Math.cos(x));

        String title1 = "The result of First tabulation";
        Printer.printArrayList(title1, firstTabulator.tabulate(firstCalculator));


        Tabulation secondTabulator = new Tabulation(10, 21, 1);

        FunctionCalculator secondCalculator = x -> {
            if (x < 13) {
                return (float) (x * Math.sin(x));
            }

            return (float) (x - 1 * Math.cos(x));
        };

        String title2 = "\nThe result of Second tabulation";
        Printer.printArrayList(title2, secondTabulator.tabulate(secondCalculator));

        // Task 2
        System.out.println("\nTask #2");

        Matrix matrix = new Matrix(N, N);

        float[] middleNegativeValues = matrix.getRowsMiddleNegativeValues();

        Printer.printMiddleRowValues(middleNegativeValues);
    }

}
