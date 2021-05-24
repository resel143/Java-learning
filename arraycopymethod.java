package com.company;

public class Main {

    public static void main(String[] args) {

        char first[] = {'a', 's', 'e', 'l','e','n','a','G','o','m','e','z'};
        char second[] = new char[7];

        System.arraycopy(first, 1, second, 0, 7);
        System.out.print(second);

    }

}
