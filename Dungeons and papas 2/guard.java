public class guard extends character{
    private int intelligence;
    private int charisma;
    private int dexterity;
    private int wisdom;

    public guard(String name, lives hearts, int strength, int defence, int intelligence, int charisma, int dexterity, int wisdom){
        super(name, hearts, strength, defence);
        this.intelligence = intelligence;
        this.charisma = charisma;
        this.dexterity = dexterity;
        this.wisdom = wisdom;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
}