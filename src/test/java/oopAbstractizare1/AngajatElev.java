package oopAbstractizare1;

public class AngajatElev extends Persoana implements Elev, Angajat {
// Aici avem Clasa care  implementeaza mai multe Interfete ( Elev si Angajat)

    public AngajatElev(String nume, String prenume, int varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {

    }

    @Override
    public void tipProgram() {

    }

    @Override
    public void remunerare() {

    }

    @Override
    public void prezenta() {

    }

    @Override
    public void studiu() {

    }

    @Override
    public void bursier() {

    }

    @Override
    public void areAbsente() {

    }
}
