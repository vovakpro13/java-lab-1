package com.volodymyr_frontend.matrix;


import java.util.Arrays;

public class Matrix {
    int[][] matrix;
    int rows;
    int cols;

    public Matrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = (int) (Math.random() * (20 + 20)) - 20;
            }

            System.out.println(Arrays.toString(matrix[row]));

        }

        this.matrix = matrix;
        this.rows = rows;
        this.cols = cols;
    }

    public float[] getRowsMiddleNegativeValues() {
        float[] middles = new float[rows];

        for (int row = 0; row < rows; row++) {
            int sumOfNegativeValues = 0;
            int negativeCount = 0;

            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] < 0) {
                    sumOfNegativeValues += matrix[row][col];
                    negativeCount++;
                }

            }

            middles[row] = negativeCount != 0 ? (float) sumOfNegativeValues / negativeCount : 0;
        }

        return middles;
    }

}
