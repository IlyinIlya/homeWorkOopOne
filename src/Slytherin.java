public class Slytherin extends Hogwarts {
    private int cunning;
    private int resourcefulness;
    private int ambition;

    public Slytherin(String firstname, String lastname, int conjure, int apparition, int cunning, int resourcefulness, int ambition) {
        super(firstname, lastname, conjure, apparition);
        this.cunning = cunning;
        this.resourcefulness = resourcefulness;
        this.ambition = ambition;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    @Override
    public String toString() {
        return "Слизерин {" +
                "Ученик: " + getFirstname() +
                " " + getLastname() +
                ", Хитрость: " + cunning +
                ", Находчивость: " + resourcefulness +
                ", Амбициозность" + ambition +
                '}';
    }

    public void printStudents() {
        System.out.println("Ученик: " + getFirstname() + " " + getLastname() +
                "; Сила магии: " + getConjure() +
                "; Расстояние трансгрессии " + getApparition() +
                "; Хитрость: " + cunning +
                ", Находчивость: " + resourcefulness +
                ", Амбициозность" + ambition);
    }

    public static void equalStudents(Slytherin sOne, Slytherin sTwo) {
        int sumPointOne = sOne.cunning + sOne.resourcefulness + sOne.ambition +
                sOne.getConjure() + sOne.getApparition();
        int sumPointTwo = sTwo.cunning + sTwo.resourcefulness + sTwo.ambition +
                sTwo.getConjure() + sTwo.getApparition();
        if (sumPointOne > sumPointTwo) {
            System.out.println(sOne.getFirstname() + " " + sOne.getLastname()
                    + " лучший Слизеринец, чем " + sTwo.getFirstname() + " " + sTwo.getLastname());
        } else {
            System.out.println(sTwo.getFirstname() + " " + sTwo.getLastname()
                    + " лучший Слизеринец, чем " + sOne.getFirstname() + " " + sOne.getLastname());
        }
    }
}
