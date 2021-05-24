package com.company;

public class Main {

    public static void main(String[] args) {

        int first[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int second[][] = {{9,8,7},{6,5,4},{3,2,1}};

        int sumthem[][] = new int[3][3];
        for(int i=0;i<first.length;i++){
            for(int j=0;j< second.length;j++){
                sumthem[i][j] = first[i][j] + second[i][j];
            }
        }
        for(int i=0;i<3;i++) for(int j=0;j<3;j++) System.out.println(sumthem[i][j]);
    }

}



Output:

10
10
10
10
10
10
10
10
10
