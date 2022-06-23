package firmaPackage;

public class AngajatCuSalarFix extends Angajat{
    private String nume;
    private double salarFix;

    public AngajatCuSalarFix(String nume, double salarFix) {
        this.nume = nume;
        this.salarFix = salarFix;
        
        System.out.println("Salariul lui " + nume + " este :" + calculSalar());
    }

    public String getName() {
        return nume;
    }

    public void setName(String name) {
        this.nume = name;
    }

    public double getSalarFix() {
        return salarFix;
    }

    public void schimbaSalarFix(double salarNou) {
        this.salarFix = salarNou;
    }

    @Override
    public String toString() {
        return "Angajat cu salar fix {" + "nume = " + nume + "Salar fix = " + salarFix + '}';
    }

	@Override
	public double calculSalar() {
		return 0;
	}
}
