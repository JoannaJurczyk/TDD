package com.sda.objects;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@Test
//@BeforeEach, AfterEach
//@BeforeAll, AfterAll
//@ParametrizedTest
//@Disabled
//@RepetedTest
//@DisplayName



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

    //Przypadki testowe
    //null -> 0.0
    //dog.weight = 5 -> 50
    //dog.weight = 10 => 100
    //dog.weight = 15 => 100
    //dog.weight = 500 => 100

    @Test
    @DisplayName("Should return price for dog smaller than 10 kg.")
    public void shouldReturnPriceForDogSmallerThan10kg(){
        //przygotowanie danych
        Dog examplePatient = new Dog("", 9);
        double expectedPrice = 90;

        //wywołanie metody testowej
        double actualPrice = vetServiceUnderTest.getTreatmentPrice(examplePatient);

        //sprawdzenie poprawności danych
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

    @DisplayName("Should return SEVERE status")
    @ParameterizedTest(name = "When description is: {0}")
    @ValueSource(strings = {"złamana noga", "złamana szczęke", "krwawi łapa", "krwawi"})
    public void shouldReturnSevere(String caseDescription){

        VetPatientStatus vetPatientStatus = vetServiceUnderTest.classifyPatientStatus(caseDescription);

        assertEquals("SEVERE", vetPatientStatus.name);
    }

    //analogia do test powyżej dla przypadku MEDIUM


}

