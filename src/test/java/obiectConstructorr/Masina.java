package obiectConstructorr;

public class Masina {

 //CONSTRUCTOR: are ca rol sa initializeze variabilele unei clase
 //Exista 2 tipuri de constructori: DEFFAULT (nu are parametri/ nu este definit) sau cu parametri
 //STRUCTURA CONSTRUCTOR: public (de cele mai multe ori), nume la fel ca si clasa, cu sau fara parametri
 //Intr-o clasa putem avea mai multi constructori diferentiati prin nr. sau tipul de parametri
 //OBIECT: instanta unei clase
 //Dintr-o clasa putem defini mai multe obiecte pe care sa le diferentiem dp nume
 //In momentul in care  instantiem un obiect se apeleaza constructorul clasei respective
 //Un obiect se instantiaza  folosind cuvantul "new"
 //Un obiect instantiat are posibilitatea sa acceseze proprietatile/ metodele din clasa respectiva

//Facem variabile globale:

  public String marca;
  public String model;
  public String motorizare;
  public int numarLocuri;
  public  int anulFabricatiei;
  public double pretulMasinii;

    public Masina(String marca, String model, String motorizare, int numarLocuri, int anulFabricatiei, double pretulMasinii) {

        this.marca = marca;
        this.model = model;
        this.motorizare = motorizare;
        this.numarLocuri = numarLocuri;
        this.anulFabricatiei = anulFabricatiei;
        this.pretulMasinii = pretulMasinii;
    }


    public Masina(String marca, String model, String motorizare, int numarLocuri, int anulFabricatiei) {
        this.marca = marca;
        this.model = model;
        this.motorizare = motorizare;
        this.numarLocuri = numarLocuri;
        this.anulFabricatiei = anulFabricatiei;
    }
    public void rezumat (){
        System.out.println("Marca masini este: "+ marca);
        System.out.println("Model masinii este: " + model);
        System.out.println("Motorizarea masinii este: "+ motorizare);
        System.out.println(" Numarul de locuri sunt "+numarLocuri);
        System.out.println("Anul fabricatiei masinii este " +anulFabricatiei);

       //Ca sa nu apara la primele 2 comenzi pretul 0.0 facem un "if" cu diferit de 0: "!="
        if (pretulMasinii!=0)

         System.out.println("Pretul masinii este: "+pretulMasinii);
    }


}
