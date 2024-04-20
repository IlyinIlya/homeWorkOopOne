public class Ravenclaw extends Hogwarts{
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
}
