package de.tum.in.ase;

public class Pumpkin {

    private double weight;
    private String face = "";
    private String type;
    private boolean seeds = true;

    public Pumpkin(String type, double weight) {
        setType(type);
        this.weight = weight;
    }

    public void deseed() {
        this.seeds = false;
        weight = getWeight() * 0.3;
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

    public String getType() {
        return type;
    }

    public boolean isSeeds() {
        return seeds;
    }
}
