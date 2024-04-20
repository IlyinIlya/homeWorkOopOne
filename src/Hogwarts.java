public abstract class Hogwarts {
    private String firstname;
    private String lastname;
    private int conjure;
    private int apparition;

    public Hogwarts(String firstname, String lastname, int conjure, int apparition) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.conjure = conjure;
        this.apparition = apparition;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getConjure() {
        return conjure;
    }

    public void setConjure(int conjure) {
        this.conjure = conjure;
    }

    public int getApparition() {
        return apparition;
    }

    public void setApparition(int apparition) {
        this.apparition = apparition;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", conjure=" + conjure +
                ", apparition=" + apparition +
                '}';
    }

    public static void equalStudents(Hogwarts hgsOne, Hogwarts hgsTwo) {
        int sumPointOne = hgsOne.conjure + hgsOne.apparition;
        int sumPointTwo = hgsTwo.conjure + hgsTwo.apparition;
        if (sumPointOne > sumPointTwo) {
            System.out.println(hgsOne.getFirstname() + " " + hgsOne.getLastname()
                    + " обладает большей мощностью магии, чем " + hgsTwo.getFirstname() + " " + hgsTwo.getLastname());
        } else {
            System.out.println(hgsTwo.getFirstname() + " " + hgsTwo.getLastname()
                    + " обладает большей мощностью магии, чем " + hgsOne.getFirstname() + " " + hgsOne.getLastname());
        }
    }

}
