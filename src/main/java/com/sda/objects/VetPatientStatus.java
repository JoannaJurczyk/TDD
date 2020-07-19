package com.sda.objects;

public class VetPatientStatus {
    String name;

    public VetPatientStatus(String name){
        this.name= name;
    }

    @Override
    public String toString() {
        return name;
    }
}
