package com.sda.objects;

public class VetService {

    // >= 10kg -> 100zł
    // < 10kg -> tyle ile waży * 10zł

    //Przypadki testowe
    //null -> 0.0
    //dog.weight = 5 -> 50
    //dog.weight = 10 => 100
    //dog.weight = 15 => 100
    //dog.weight = 500 => 100
    //dog.weight = 501 => XXX

    double getTreatmentPrice(Dog vetPatient) {
        if(vetPatient == null){
            return 0; //wyrzucenie wyjątku
        }

        int weight = vetPatient.weight;
        if (weight >= 10) {
            return 100;
        } else {
            return weight * 10;
        }

    }

    //"złamana noga", "złamana szczęke", "krwawi łapa", "krwawi" -> SEVERE
    //"kaszle", "ma pchły" -> NORMAL

    VetPatientStatus classifyPatientStatus(String description){
        if(description.contains("krwawi") || description.contains("złaman")){
            return new VetPatientStatus("SEVERE");
        }
        if(description.contains("kaszle") || description.contains("pchły") || description.contains("kicha")){
            return new VetPatientStatus("NORMAL");
        }
        return new VetPatientStatus("TRIVIAL");
    }
}

