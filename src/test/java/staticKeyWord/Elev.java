package staticKeyWord;

public class Elev {
    // Static- keyword care poate sa  fi folosit la proprietati  sau metode
    //Scopul ac keyw. este sa iti dea posibilitate sa accesezi proprietatea/ metoda fara a avea nevoie de un obiect de tipul clasei
    //In mom. cand o proprietate este statica  toate obiectele au ac. valoare pt ea
    // In mom cand o metoda este statica , o putem accesa folosind numele clasei
    // Este de recomandat sa nu abuzam de static si sa-l folosim cel mai des la logica pt utilitare
    //Static provoaca f. mari probleme cand vine vb de executii in paralel
    // Conceptul STATIC funct.F bine cu o CONSTANTA, ac.  e o proprietate care setata nu-si m. modifica val.
    //(folosita  de ex. la logare)spre deosebire de o VARIABILA ( care e o propr. care-si modifica val.)
    // Dc folosim doar STATIC (linia 17/ 20) pe lg ca le poti accesa le poti si modifica, dc le facem
    // Constante nu le mai poti modifica ci doar accesa
    //CONCLUZIE : NU TREBUIE ABUZAT DE STATIC folosit doar in situatii care stii ca nu se  modifica, altfel te incurca

    private String nume;
    private String prenume;
    private int varsta;
    private String clasa;
    private static String scoala ="Liviu Rebreanu";

    //1. Aici incrementam/ introducem un elev (ordinea inscrierii 1,2,3..)
    private static int idElev=0;

    public Elev(String nume, String prenume, int varsta, String clasa, String scoala) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.clasa = clasa;
    //2. Prin idElev++ tine minte sa porn.de la val "0" de n. sus si sa adauge cate 1, in ordine inscrierii
        idElev++;
    }

        public void infoElev(){
            System.out.println("Nume: "+nume);
            System.out.println("Prenume: "+prenume);
            System.out.println("Varsta:"+varsta);
            System.out.println("Clasa:"+clasa);
            System.out.println("Scoala: "+scoala);
            System.out.println("ID elev este:"+idElev);

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

    public String getClasa() {
        return clasa;
    }

    public void setClasa(String clasa) {
        this.clasa = clasa;
    }

    public static String getScoala() {
        return scoala;
    }

    public static void setScoala(String scoala) {
        Elev.scoala = scoala;
    }

    public static int getIdElev() {
        return idElev;
    }

    public static void setIdElev(int idElev) {
        Elev.idElev = idElev;
    }
}




