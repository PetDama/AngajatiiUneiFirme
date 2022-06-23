package firmaPackage;

import java.util.ArrayList;
import java.util.List;

public class Firma {
    private List<Angajat> angajati = new ArrayList<Angajat>();

    public List<Angajat> getAngajati() {
        return angajati;
    }

    public void setAngajati(List<Angajat>angajati) {
        this.angajati = angajati;
    }

    public boolean angajeaza(Angajat angajat){
        if(angajati != null)
            if(angajati.add(angajat))
                return false;
            else{
                angajati.add(angajat);
                return true;
            }
        return true;
    }

   
}
