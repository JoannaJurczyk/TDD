package com.sda.newpackage;

public class HelloWorld {

    public static void main(String[] args) {

        int suma = 0;


        for (int i = 0; i < 10; i++) {
            suma = suma + i;

        }
        System.out.println(suma);

    }

    int sumSequence(int x){
        int sum = 0;
        for (int i = 1; i <= x; i++) {
           sum = sum + i;
        }
        return sum;
    }

}
