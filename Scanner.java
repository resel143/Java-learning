package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Welcome to The Restaurant");
            System.out.println("What would you like to have: \n1. Dosa \n2. Pizza \n3. Burger");
            System.out.println("Enter your choise: ");;
            int order = sc.nextInt();

            if(order==1 || order == 2 || order==3){
                System.out.print("\nKhud banale bsdk");
            }

    }
}
