package com.company;
import java.util.Scanner;

class worker{
    int id;
    String name;
    String company;

    worker(int i, String n, String c){
        id = i;
        name = n;
        company = c;
    }
    void display(){
        System.out.println(id + " " + name + " " + company);
    }
}



public class Main {

    public static void main(String[] args) {
            worker w1 = new worker(123, "Reshul", "Readza");

            worker w3 = new worker(101, "SelenaG", "Selg Industries");
        worker w2 = new worker(256, "Apurva", "ReadZa");


            w1.display();
            w2.display();
            w3.display();

    }
}
