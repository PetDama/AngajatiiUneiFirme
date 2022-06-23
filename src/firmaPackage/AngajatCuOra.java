package firmaPackage;

public class AngajatCuOra extends Angajat{
    private String nume;
    private int ore;
    private double salarPeOra;

    public AngajatCuOra(String nume, int ore, double salarFix) {
        this.nume = nume;
        this.ore = ore;
        this.salarPeOra = salarFix;
        System.out.println("Salariul lui " + nume + " este :" + calculSalar());
    }
    
    public String getName() {
        return nume;
    }

    public void setName(String nume) {
        this.nume = nume;
    }

    public int getOre() {
        return ore;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    public double getSalarPeOra() {
        return salarPeOra;
    }

    public void adaugaOre(int orePlus){
        this.ore = orePlus;
    }

    @Override
    public String toString() {
        return "Angajat cu ora {" + "nume = " + nume + "ore = " + ore +
        		"Salar pe ora = " + salarPeOra + '}';
    }
	@Override
	public double calculSalar() {
		return 0;
	}
}