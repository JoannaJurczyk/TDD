package com.sda.newpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SequenceSummerTest {

    SequenceSummer sequenceSummer;

    @BeforeEach
    void setUp() {
        sequenceSummer = new SequenceSummer();
    }



    @DisplayName("Should sum sequence")
    @ParameterizedTest(name = "For {0} should return {1}")
    @MethodSource("testDataGenerator")
    void sumSequence(int testData, int expectedResult) {
        int actualResult = sequenceSummer.sumSequence(testData);

        assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> testDataGenerator(){
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(2, 3),
                Arguments.of(3, 6),
                Arguments.of(4, 10)
        );
    }

    static Stream<Arguments> betterTestDataGenerator(){
        ArrayList<Arguments> argumentsToReturn = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int expectedResult = i * (i + 1) / 2;
            Arguments generatedArguments = Arguments.of(i, expectedResult);
            argumentsToReturn.add(generatedArguments);
        }

        return argumentsToReturn.stream();
    }


    public static void main(String[] args) {
        betterTestDataGenerator();
    }



    static Stream<Arguments> pairIntsGenerator(){
        List<Arguments> allPairs = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                allPairs.add(Arguments.of(i,j));
            }
        }
        return allPairs.stream();
    }


}



