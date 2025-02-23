import java.util.ArrayList;

public class character {
    private String name;
    private lives hearts;
    private int strength; 
    private int defence;

    public character(String name, lives hearts, int strength, int defence){
        this.name = name;
        this.hearts = hearts;
        this.strength = strength;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
