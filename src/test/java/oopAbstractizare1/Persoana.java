package oopAbstractizare1;

public class Persoana {

    //Abstractizarea = conceptul prin care se poate defini cu exactitate comportomaentul unei clase
    //Abstractizarea se poate realiza in 2 feluri: 1. interfata, 2. clasa abstracta
    // 1. Intelegem print-o interfata, ca fiind o structura care contine doar metode abstracte
    //Pe lg. faptul ca , toate metodele sunt  abstracte mai sunt si publice
    //O interfata se recunoaste prin cuvantul "interface"
    //O interf. se implementeaza:
    //O interf. poata sa fie impl. de 1 sau m. multe clase
    //Clasa care implementeaza interfata trebuie sa implem. toate metodele din interfata
    //O clasa poate sa implem. m. multe interfete
    //o interfata poate sa fie implementata de o clasa abstracta
    //O interf. nu poata sa contina un constructor, rezulta, nu putem face un obiect.
    //Putem aplica ac. concepte in automation de ex. la browsere (chrom, firefox), ex. emag, sa faci
    // o comanda in m. multe circumstante ( cu cont/ user, fara cont/ guest, ca admin ) poti folosi interfetele
    //pt. diferentiere.

  // Aici avem conceptul de INCAPSULARE
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
