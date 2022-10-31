package de.tum.in.ase;

public class JackOLantern {
    //TODO construct correct attributes
    String name;
    Pumpkin pumpkin;
    Candle candle;
    de.tum.in.ase.ghost ghost;

    //TODO write constructor with parameters
    JackOLantern(String name, Pumpkin pumpkin, Candle candle, de.tum.in.ase.ghost ghost){
        this.name = name;
        this.pumpkin = pumpkin;
        this.candle = candle;
        this.ghost = ghost;

        pumpkin.deseed();
        pumpkin.carveFace(ghost.getTemper());
        candle.light();
    }


    public double getLanternWeight() {
        //TODO calculate the total weight of your Jack O'Lantern
        return pumpkin.getWeight() + candle.calculateWeight();
    }


    public static void main(String[] args) {
       /*
       You can test your code here by constructing objects. Have fun :)
       */
        Pumpkin p = new Pumpkin("bulky", 35.50);
        Candle c = new Candle(4.5, 13);
        de.tum.in.ase.ghost g = new ghost("hot", 4);
        JackOLantern J = new JackOLantern("BadBoy", p, c, g);
        double jacksWeight = J.getLanternWeight();
    }
}
