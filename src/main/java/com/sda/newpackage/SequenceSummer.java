package com.sda.newpackage;

public class SequenceSummer {

    int sumSequence(int x){
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
