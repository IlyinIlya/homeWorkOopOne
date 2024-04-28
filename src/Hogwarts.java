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

    public void equalStudents(Hogwarts hgsPerson) {
        int sumPointOne = conjure + apparition;
        int sumPointTwo = hgsPerson.conjure + hgsPerson.apparition;
        if (sumPointOne > sumPointTwo) {
            System.out.println(getFirstname() + " " + getLastname()
                    + " обладает большей мощностью магии, чем " + hgsPerson.getFirstname() + " " + hgsPerson.getLastname());
        } else {
            System.out.println(hgsPerson.getFirstname() + " " + hgsPerson.getLastname()
                    + " обладает большей мощностью магии, чем " + getFirstname() + " " + getLastname());
        }
    }

}
