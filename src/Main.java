import firmaPackage.Angajat;
import firmaPackage.AngajatCuOra;
import firmaPackage.AngajatCuSalarFix;
import firmaPackage.Firma;

public class Main {
    public static void main(String[] args){
        Angajat angS1 = new AngajatCuSalarFix("Alin", 1500);
        Angajat angS2 = new AngajatCuSalarFix("Alex", 1800);

        Angajat angO1 = new AngajatCuOra("Andrei", 12,200);
        Angajat angO2 = new AngajatCuOra("Alex", 15,240);

        Firma firma = new Firma();
        firma.angajeaza(angS1);
        firma.angajeaza(angS2);
        firma.angajeaza(angO1);
        firma.angajeaza(angO2);

        System.out.println("Salariul mediu al firmei este : " + firma);

        ((AngajatCuSalarFix) angS1).schimbaSalarFix(2400);
        ((AngajatCuOra) angO1).adaugaOre(8);
        
        System.out.println("Noul salariu mediu al firmei este : " + firma);
    }
}