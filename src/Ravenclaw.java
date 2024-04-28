public class Ravenclaw extends Hogwarts {
    private int smart;
    private int witty;
    private int creativity;

    public Ravenclaw(String firstname, String lastname, int conjure, int apparition, int smart, int witty, int creativity) {
        super(firstname, lastname, conjure, apparition);
        this.smart = smart;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Когтевран {" +
                "Ученик: " + getFirstname() +
                " " + getLastname() +
                ", Мудрость: " + smart +
                ", Остроумность: " + witty +
                ", Творчество: " + creativity +
                '}';
    }

    public void printStudents() {
        System.out.println("Ученик: " + getFirstname() + " " + getLastname() +
                "; Сила магии: " + getConjure() +
                "; Расстояние трансгрессии " + getApparition() +
                "; Мудрость: " + smart +
                ", Остроумность: " + witty +
                ", Творчество: " + creativity);
    }

    public void equalStudents(Ravenclaw rPerson) {
        int sumPointOne = smart + witty + creativity;
        int sumPointTwo = rPerson.smart + rPerson.witty + rPerson.creativity;
        if (sumPointOne > sumPointTwo) {
            System.out.println(getFirstname() + " " + getLastname()
                    + " лучший Когтевранец, чем " + rPerson.getFirstname() + " " + rPerson.getLastname());
        } else {
            System.out.println(rPerson.getFirstname() + " " + rPerson.getLastname()
                    + " лучший Когтевранец, чем " + getFirstname() + " " + getLastname());
        }
    }
}
