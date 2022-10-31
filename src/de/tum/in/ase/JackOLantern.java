package de.tum.in.ase;

public class JackOLantern {
    //TODO construct correct attributes
    String name;
    Pumpkin pumpkin;
    Candle candle;
    Ghost ghost;

    //TODO write constructor with parameters
    public JackOLantern(String name, Pumpkin pumpkin, Candle candle, Ghost ghost){
        setName(name);
        setPumpkin(pumpkin);
        setCandle(candle);
        setGhost(ghost);

        getPumpkin().deseed();
        getPumpkin().carveFace(ghost.getTemper());
        getCandle().light();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCandle(Candle candle) {
        this.candle = candle;
    }

    public void setGhost(Ghost ghost) {
        this.ghost = ghost;
    }

    public void setPumpkin(Pumpkin pumpkin) {
        this.pumpkin = pumpkin;
    }

    public Pumpkin getPumpkin() {
        return pumpkin;
    }

    public Candle getCandle() {
        return candle;
    }

    public Ghost getGhost() {
        return ghost;
    }

    public double getLanternWeight() {
        //TODO calculate the total weight of your Jack O'Lantern
        return getPumpkin().getWeight() + getCandle().calculateWeight();
    }


    public static void main(String[] args) {
       /*
       You can test your code here by constructing objects. Have fun :)
       */
        Pumpkin p = new Pumpkin("bulky", 35.50);
        Candle c = new Candle(4.5, 13);
        Ghost g = new Ghost("hot", 4);
        JackOLantern J = new JackOLantern("BadBoy", p, c, g);

    }
}
