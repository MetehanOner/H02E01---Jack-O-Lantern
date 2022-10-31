package de.tum.in.ase;

public class Candle {
    double height;
    double radius;
    boolean burning = false;

    public Candle(double radius, double height){
        setRadius(radius);
        setHeight(height);
    }

    public void light(){
        isBurning();
    }

    public double calculateWeight(){
        return (getHeight()*(getRadius()*getRadius()*(3.14)))*(0.95);
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

    public boolean isBurning() {
        return burning = true;
    }

    public void setBurning(boolean burning) {
        this.burning = burning;
    }
}
