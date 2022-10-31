package de.tum.in.ase;

public class Pumpkin {

    double weight;
    String face = "";
    String type;
    boolean seeds = true;

    public Pumpkin(String type, double weight) {
        setType(type);
        setWeight(weight);
    }

    public void deseed() {
        this.seeds = false;
        weight = weight*0.7;
    }

    public void carveFace(String temper) {
        this.face = temper;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getFace() {
        return face;
    }
}
