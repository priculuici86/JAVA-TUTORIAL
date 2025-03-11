package oopAbstractizare1;

public class AngajatPersona extends Persoana implements Angajat{
  private String domeniu;
  private String experienta;
  private String firma;

    public AngajatPersona(String nume, String prenume, int varsta, String domeniu, String experienta, String firma) {
        super(nume, prenume, varsta);
        this.domeniu = domeniu;
        this.experienta = experienta;
        this.firma = firma;
    }
    public void rezumatAngajat(){
        infoPersoane();
        System.out.println("Domeniu angajatului este "+domeniu);
        System.out.println("Experienta angajatului este "+experienta);
        System.out.println("Firma la care lucreaza angajatul este "+firma);

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
}
