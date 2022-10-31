package de.tum.in.ase;

public class Candle {
    double height, radius;
    boolean burning;

    Candle(double radius, double height){
        setRadius(radius);
        setHeight(height);
    }

    public void light(){
        this.burning = true;
    }

    public double calculateWeight(){
        return getHeight()*(getRadius()*getRadius()*Math.PI);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight(){
        return height;
    }

    public double getRadius() {
        return radius;
    }
}
