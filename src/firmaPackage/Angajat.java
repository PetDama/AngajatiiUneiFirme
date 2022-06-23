package firmaPackage;

abstract public class Angajat{

    private String nume;

    public Angajat() {}

    public Angajat(String nume) {
        this.nume = nume;
    }

    abstract public  double calculSalar();

    public String getName() {
        return nume;
    }

    public void setName(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return nume;
    }
}
