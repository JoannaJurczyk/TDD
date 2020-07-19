package com.sda.newpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SequenceSummerTest {

    SequenceSummer sequenceSummer;

    @BeforeEach
    void setUp(){
        sequenceSummer = new SequenceSummer();
    }
    @ParameterizedTest
    @MethodSource ("testDataGeneration")
    void setSequence(int testData, int expectedResult){
    }
    static Stream<Arguments> testDataGenerator(){

    }

}