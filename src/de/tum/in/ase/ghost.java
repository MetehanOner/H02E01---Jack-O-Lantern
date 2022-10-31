package de.tum.in.ase;

public class ghost {

    String temper;
    int age;

    ghost(String temper, int age){
        setTemper(temper);
        setAge(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTemper(String temper) {
        this.temper = temper;
    }

    public String getTemper(){
        return temper;
    }
}
