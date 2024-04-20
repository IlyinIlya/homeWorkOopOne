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

    public static void equalStudents(Gryffindor gOne, Gryffindor gTwo) {
        int sumPointOne = gOne.chivalry + gOne.honor + gOne.bravery +
                gOne.getConjure() + gOne.getApparition();
        int sumPointTwo = gTwo.chivalry + gTwo.honor + gTwo.bravery +
                gTwo.getConjure() + gTwo.getApparition();
        if (sumPointOne > sumPointTwo) {
            System.out.println(gOne.getFirstname() + " " + gOne.getLastname()
                    + " лучший Гриффиндорец, чем " + gTwo.getFirstname() + " " + gTwo.getLastname());
        } else {
            System.out.println(gTwo.getFirstname() + " " + gTwo.getLastname()
                    + " лучший Гриффиндорец, чем " + gOne.getFirstname() + " " + gOne.getLastname());
        }
    }
}
