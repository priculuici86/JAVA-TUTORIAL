package temaOopAbstractizareInterfete;

public class Afacere {
    private String tipActivitate;
    private String punctDeLucru;
    private int numarAngajati;

    public Afacere(String tipActivitate, String punctDeLucru, int numarAngajati) {
        this.tipActivitate = tipActivitate;
        this.punctDeLucru = punctDeLucru;
        this.numarAngajati = numarAngajati;
    }

    public void infoAfacere(){

        System.out.println("Specificul activitatii este " +tipActivitate);
        System.out.println("Punctul de lucru este "+punctDeLucru);
        System.out.println("Numarul de angajati este " +numarAngajati) ;
    }

    public String getTipActivitate() {
        return tipActivitate;
    }

    public void setTipActivitate(String tipActivitate) {
        this.tipActivitate = tipActivitate;
    }

    public String getPunctDeLucru() {
        return punctDeLucru;
    }

    public void setPunctDeLucru(String punctDeLucru) {
        this.punctDeLucru = punctDeLucru;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }
}
