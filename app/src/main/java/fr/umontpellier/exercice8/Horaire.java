package fr.umontpellier.exercice8;

import java.io.Serializable;

public class Horaire implements Serializable {
    String heure;

    public Horaire(){
    }

    public Horaire(String heure) {
        this.heure = heure;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }
}
