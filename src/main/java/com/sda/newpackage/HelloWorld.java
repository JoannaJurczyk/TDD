package com.sda.newpackage;

public class HelloWorld {

    public static void main(String[] args) {

        //suma liczb do zadanego N
        //1,2,3,4 -> 1+2+3+4 = 10
        //1. Zdefiniuj zmienną int o nazwie suma i przypisz jej wartość 0.
        //2. Napisz pętlę, która w każdym kroku do sumy doda wartość z licznkia (i), pętla "idzie" do 10
        //3. Wypisz na ekran zminną suma (sout)

        // X -> sumę od 0 do X-1

        // =============================================================
        int suma = 0;
        for (int i = 0; i < 10; i++) { //od 0 do 9
            suma = suma + i;
        }
        System.out.println(suma);
        // =============================================================


        //DLA CHĘTNYCH
        int sumaParzystych = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                sumaParzystych = sumaParzystych + i;
            }
            System.out.println(sumaParzystych);
        }

        System.out.println(sumaParzystych);
    }

    int sumSequence(int x) {
        int sum = 0;
        //Modyfikacje:
        //int i = 1;
        //i <= x;
        for (int i = 1; i <= x; i++) {
            sum = sum + i;
        }
        return sum;
    }

}

//suma liczb przystych do zadanego N
//0,1,2,3,4,5,6,7,8,9 -> 20

