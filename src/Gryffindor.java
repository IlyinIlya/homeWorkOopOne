public class Gryffindor extends Hogwarts {
    private int chivalry;
    private int honor;
    private int bravery;

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
        return "Гриффиндор {" +
                "Ученик: " + getFirstname() +
                " " + getLastname() +
                ", Благородство: " + chivalry +
                ", Честь: " + honor +
                ", Храбрость: " + bravery +
                '}';
    }

    public void printStudents() {
        System.out.println("Ученик: " + getFirstname() + " " + getLastname() +
                "; Сила магии: " + getConjure() +
                "; Расстояние трансгрессии: " + getApparition() +
                "; Благородство: " + chivalry +
                "; Честь: " + honor +
                "; Храбрость: " + bravery);
    }

    public void equalStudents(Gryffindor gPerson) {
        int sumPointOne = chivalry + honor + bravery;
        int sumPointTwo = gPerson.chivalry + gPerson.honor + gPerson.bravery;
        if (sumPointOne > sumPointTwo) {
            System.out.println(getFirstname() + " " + getLastname()
                    + " лучший Гриффиндорец, чем " + gPerson.getFirstname() + " " + gPerson.getLastname());
        } else {
            System.out.println(gPerson.getFirstname() + " " + gPerson.getLastname()
                    + " лучший Гриффиндорец, чем " + getFirstname() + " " + getLastname());
        }
    }
}
