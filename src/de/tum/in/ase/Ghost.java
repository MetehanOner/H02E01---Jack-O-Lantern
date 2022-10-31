package de.tum.in.ase;

public class Ghost {

    private String temper;
    public int age;

    public Ghost(String temper, int age){
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

    public int getAge() {
        return age;
    }
}
