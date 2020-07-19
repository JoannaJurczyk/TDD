package com.sda.objects;

public class Dog {


    String name;
    int weight;

    Dog(){
        this.name = "Burek";
        this.weight = 10;
    }
    Dog(String newDogName, int newDogWeight){

        if(newDogWeight <= 0 || newDogWeight > 500){
            throw new IllegalArgumentException();
        }

        this.name = newDogName;
        this.weight= newDogWeight;
    }

    String describeDog(){
        return name + " : " + weight;
    }
}
