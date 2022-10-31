package de.tum.in.ase;

public class Pumpkin {

    double weight;
    String face = "";
    String type;
    boolean seeds = true;

    Pumpkin(String type, double weight) {
        this.type = type;
        this.weight = weight;
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

    public String getFace() {
        return face;
    }

    public String getType() {
        return type;
    }

    public boolean isSeeds() {
        return seeds;
    }
}
