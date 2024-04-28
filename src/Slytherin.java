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

    public void equalStudents(Slytherin sPerson) {
        int sumPointOne = cunning + resourcefulness + ambition;
        int sumPointTwo = sPerson.cunning + sPerson.resourcefulness + sPerson.ambition;
        if (sumPointOne > sumPointTwo) {
            System.out.println(getFirstname() + " " + getLastname()
                    + " лучший Слизеринец, чем " + sPerson.getFirstname() + " " + sPerson.getLastname());
        } else {
            System.out.println(sPerson.getFirstname() + " " + sPerson.getLastname()
                    + " лучший Слизеринец, чем " + getFirstname() + " " + getLastname());
        }
    }
}
