package de.tum.in.ase;

public class Candle {
    double height, radius;
    boolean burning;

    Candle(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public void light(){
        this.burning = true;
    }

    public double calculateWeight(){
        return height*(radius*radius*Math.PI);
    }

    public double getHeight(){
        return height;
    }

    public double getRadius() {
        return radius;
    }
}
