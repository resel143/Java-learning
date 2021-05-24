package com.company;

public class Main {

    public static void main(String[] args) {

        int first[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int second[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int prodMatrix[][] = new int[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) for (int k = 0; k < 3; k++) prodMatrix[i][j] += first[i][k] * second[k][j];
        for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) System.out.println(prodMatrix[i][j]);
    }
}
