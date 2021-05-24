package com.company;

public class Main {

    public static void main(String[] args) {
//        jagged array
        int roll[][] = new int[3][];
        roll[0]= new int[4];
        roll[1] = new int[3];
        roll[2]=new int[2];
        int count = 0;
        for(int i=0;i<roll.length;i++){
            for(int j=0;j<roll[i].length;j++){
                roll[i][j]= count++;
            }
        }
        for(int i=0;i<roll.length;i++){
            for(int j=0;j<roll[i].length;j++){
                    System.out.print(roll[i][j]);
            }
            System.out.println("\n");
        }

    }

}



Output:
0123

456

78
