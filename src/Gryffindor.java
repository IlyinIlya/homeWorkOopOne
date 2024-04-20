public class Gryffindor extends Hogwarts{
    private int chivalry;
    private int honor;
    private int bravery;
   // private final String faculty = "Гриффиндор";

    public Gryffindor(String firstname, String lastname, int conjure, int apparition, int chivalry, int honor, int bravery) {
        super(firstname, lastname, conjure, apparition);
        this.chivalry = chivalry;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getChivalry() {
        return chivalry;
    }

    public void setChivalry(int chivalry) {
        this.chivalry = chivalry;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "Ученик: " + getFirstname() +
                " "+ getLastname() +
                ", chivalry: " + chivalry +
                ", honor: " + honor +
                ", bravery: " + bravery +
                '}';
    }
}
