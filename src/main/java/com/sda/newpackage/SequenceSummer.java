package com.sda.newpackage;

public class SequenceSummer {

    //0 | 0
    //1 | 1
    //2 | 3
    //3 | 6
    //4 | 10
    //

    int sumSequence(int x){
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
