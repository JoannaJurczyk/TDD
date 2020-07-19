package com.sda.objects;

public class VetService {

    double getTreatmentPrice(Dog vetPatient){

        if(vetPatient == null){
            return 0;
        }


        int weight = vetPatient.weight;

        if(weight >= 10){
            return 100;
        } else {
            return weight * 10;
        }
    }

    VetPatientStatus classifyPatientStatus(String description){
        if (description.contains("krwawi")|| description.contains("złaman")){
            return new VetPatientStatus("Severe");
        }
        if(description.contains("kaszle") || description.contains("pchły") || description.contains("kicha")){
            return new VetPatientStatus("Normal");
        }
        return new VetPatientStatus("Trivial");

    }
}
