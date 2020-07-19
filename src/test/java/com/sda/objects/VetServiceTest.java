package com.sda.objects;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class VetServiceTest {

    VetService vetServiceUnderTest;
    @BeforeEach
    public void setUp(){
        vetServiceUnderTest = new VetService();
    }

    @AfterEach
    public void tearDown(){
        System.out.println("Test zakończył się poprawnie");
    }

    @Test
    @DisplayName("Should return price for dog smaller than 10 kg.")
    public void shouldReturnPriceForDogSmallerThank10kg(){
        Dog examplePatient = new Dog ( "",9);
        double expectedPrice = 90;

        double actualPrice = vetServiceUnderTest.getTreatmentPrice(examplePatient);

        assertEquals(expectedPrice, actualPrice);
    }
    @Test
    @DisplayName("Should return 0 for dog == null")
    public void shouldReturnZeroForNull(){
        Dog examplePatient = null;
        double expectedPrice = 0;
        double actualPrice = vetServiceUnderTest.getTreatmentPrice(examplePatient);
        assertEquals(expectedPrice, actualPrice);

    }
    @Test
    public void shouldReturnPriceForDog15kg(){
        Dog examplePatient = new Dog ("", 15);
        double expectedPrice = 100;
        double actualPrice = vetServiceUnderTest.getTreatmentPrice(examplePatient);
        assertEquals(expectedPrice, actualPrice);

    }
    @DisplayName("Should return Severe status")
    @ParameterizedTest(name = "When description is: {0}")
    @ValueSource(strings = {"złamana noga", "złamana szczęka", "krwawi łapa", "krwawi"})
    public void shouldReturnSevere(String caseDescription){
        VetPatientStatus vetPatientStatus = vetServiceUnderTest.classifyPatientStatus(caseDescription);
        assertEquals("Severe", vetPatientStatus.name);

    }
    @ParameterizedTest
    @ValueSource(strings = {"kaszle", "pchły", "kicha"})
    public void shouldReturnNormal(String caseDescription) {
        VetPatientStatus vetPatientStatus = vetServiceUnderTest.classifyPatientStatus(caseDescription);
        assertEquals("Normal", vetPatientStatus.name);
    }


}