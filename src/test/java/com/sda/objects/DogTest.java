package com.sda.objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {


    @Test
    public void shouldNotCreateDogWhenWeightLowerThanZero(){
        assertThrows(
                IllegalArgumentException.class,
                () -> { new Dog("asd", -1); },
                "Niepoprawna waga psa"
        );

    }

    @Test
    public void test(){

    }

}

//commint -> Version Controll/Local changes
//LOG -> LOG




