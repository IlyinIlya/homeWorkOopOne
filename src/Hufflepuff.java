public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String firstname, String lastname, int conjure, int apparition, int hardworking, int loyal, int honest) {
        super(firstname, lastname, conjure, apparition);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Пуффендуй {" +
                "Ученик: " + getFirstname() +
                " " + getLastname() +
                ", Трудолюбие: " + hardworking +
                ", Верность: " + loyal +
                ", Честность: " + honest +
                '}';
    }

    public void printStudents() {
        System.out.println("Ученик: " + getFirstname() + " " + getLastname() +
                "; Сила магии: " + getConjure() +
                "; Расстояние трансгрессии " + getApparition() +
                "; Трудолюбие: " + hardworking +
                ", Верность: " + loyal +
                ", Честность: " + honest);
    }

    public void equalStudents(Hufflepuff hPerson) {
        int sumPointOne = hardworking + loyal + honest;
        int sumPointTwo = hPerson.hardworking + hPerson.loyal + hPerson.honest;
        if (sumPointOne > sumPointTwo) {
            System.out.println(getFirstname() + " " + getLastname()
                    + " лучший Пуффендуец, чем " + hPerson.getFirstname() + " " + hPerson.getLastname());
        } else {
            System.out.println(hPerson.getFirstname() + " " + hPerson.getLastname()
                    + " лучший Пуффендуец, чем " + getFirstname() + " " + getLastname());
        }
    }
}
