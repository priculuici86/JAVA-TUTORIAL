package oopAbstractizare2;

public abstract class Persoana {
    // O cl abstracta funct ca o cl normala in mare partre
    //O clasa abstracta poate sau nu sa contina metode abstracte
    //Recunoastem o cl abstracta dp cuvantul abstract
    //Pt a face o metoda abstracta in clasa trebuie sa punem cuvantul abstract
    //Int-o cl abs.putem avea met. privat, protected, static
    //Intr-o cl abst putem avea un constructor=> nu putem face un obiect
    //Ocl abstracta se mosteneste => cl care mosteneste trebuie sa implementeze toate met abstracte

    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }
    public void infoPersoane (){
        System.out.println("Numele persoanei este "+nume);
        System.out.println("Prenumele persoanei este "+prenume);
        System.out.println("Varsta angajatului este" +varsta);

    }
    public abstract void munceste();
    public abstract void tipProgram();
    public abstract void remunerare();
    public abstract void prezenta();
    public abstract void studiu();
    public abstract void bursier();
    public abstract void areAbsente();


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}




