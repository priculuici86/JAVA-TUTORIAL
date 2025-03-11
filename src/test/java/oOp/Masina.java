package oOp;

public class Masina {
    // OOP= PROGRAMARE ORIENTATA OBIECT
    //Exista 4 principii = 1.mostenirea, 2. Incapsularea datelo, 3.Polimorfismul, 4.Abstractizarea
    //1.MOSTENIREA= conceptul prin care o clasa (copil) mosteneste o alta clasa(parinte)
    //In java putem mosteni o singura clasa
    // Ca sa mostenim o clasa fofisim "extends"
    //In momentul in care clasa copil mosteneste clasa parinte, copilul trebuie sa apeleze  CONSTRUCTORUL din parinte
    //Copilul apeleaza constr. Parinte folosind cuvntul "Super"
    //In momentul in care clasa copil mosteneste clasa parinte, copilul are acces lavariabile/ metode din parinte


    //03.03.2025
    //Incapsulare: Conceptul prin care putem defini restrictii la nivel de vizibilitate pt. proprietati/ metode

    // Pt a seta retrictii avem nevoie de "acces control" de tip private/ protected
    // Private= acces control care restrictioneaza vizibilitatea doar la nivel clasa

    //Polimorfismul: conceptul prin care o metoda poate avea implemntari diferite la nivel de body sau structura
    //Polimorfismul e de 2 feluri: dinamic ( override) si static( overload)
    //Polimorfismul dinamic: intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    //Polimorfismul static: posibilitatea prin care putem avea mai multe metode cu acelasi nume diferentiate prin numar/
    // tip de parametri.
    //INCAPSULARE: din "public" facem proprietatile "private", astfel propr. nu mai ies din clasa, dar pt. ca
    // avem nevoie sa iasa din clasa , apelam la geter/seter, dp. stabilim geter si seter pt fiecare propr.

    private String marca;
    private String model;
    private int anFabricatie;
    private String combustibil;
    private int pret;

    public Masina(String marca, int pret, String model, int anFabricatie, String combustibil) {
        this.marca = marca;
        this.pret = pret;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.combustibil = combustibil;
    }
    public void rezumatComanda(){
        System.out.println("Marca masinii este: "+marca);
        System.out.println("Modelul masinii este: "+model);
        System.out.println("Anul de fabricatie al masinii este: "+anFabricatie);
        System.out.println("Combustibil masina: "+combustibil);
        System.out.println("Pretul masinii este: "+pret);

    }

    //Polimorfism dinamic
    public void pornesteMotor(){
        System.out.println("Masina porneste motorul din cheie");
    }
//INCAPSULARE: - (Generate-> geter/seter)
// GETER (afiseaza inform.)/ SETER(ne da  o metoda cu void care, modifica parametrul):
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public void setCombustibil(String combustibil) {
        this.combustibil = combustibil;
    }

    public int getPret() {
        return pret;
    }
}
