public class character {
    private lives hearts;
    private int strength; 
    private int defence;

    public character(lives hearts, int strength, int defence){
        this.hearts = hearts;
        this.strength = strength;
        this.defence = defence;
    }

    public lives getHearts() {
        return hearts;
    }

    public void setHearts(lives hearts) {
        this.hearts = hearts;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
