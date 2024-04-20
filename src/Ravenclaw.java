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

    public static void equalStudents(Ravenclaw rOne, Ravenclaw rTwo) {
        int sumPointOne = rOne.smart + rOne.witty + rOne.creativity +
                rOne.getConjure() + rOne.getApparition();
        int sumPointTwo = rTwo.smart + rTwo.witty + rTwo.creativity +
                rTwo.getConjure() + rTwo.getApparition();
        if (sumPointOne > sumPointTwo) {
            System.out.println(rOne.getFirstname() + " " + rOne.getLastname()
                    + " лучший Когтевранец, чем " + rTwo.getFirstname() + " " + rTwo.getLastname());
        } else {
            System.out.println(rTwo.getFirstname() + " " + rTwo.getLastname()
                    + " лучший Когтевранец, чем " + rOne.getFirstname() + " " + rOne.getLastname());
        }
    }
}
