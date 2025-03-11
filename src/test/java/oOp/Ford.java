package oOp;

import java.util.List;

public class Ford extends Masina {
   private List <String>dotariInterioare;
   private List<String>dotariExteriore;

    public Ford(String marca, int pret, String model, int anFabricatie, String combustibil,
     List<String>dotariInterioare, List<String>dotariExteriore) {
        super(marca, pret, model, anFabricatie, combustibil);
        this.dotariInterioare=dotariInterioare;
        this.dotariExteriore=dotariExteriore;

    }
    public void rezumatFord(){
        rezumatComanda();
        System.out.println("Dotarile interioare Dacia sunt: "+dotariInterioare);
        System.out.println("Dotarile exterioare Dacia sunt: "+dotariExteriore);
    }

    public void pornesteMotor(){
        System.out.println("Masinile Ford pornesc singure");
    }

    public List<String> getDotariInterioare() {
        return dotariInterioare;
    }

    public void setDotariInterioare(List<String> dotariInterioare) {
        this.dotariInterioare = dotariInterioare;
    }

    public List<String> getDotariExteriore() {
        return dotariExteriore;
    }

    public void setDotariExteriore(List<String> dotariExteriore) {
        this.dotariExteriore = dotariExteriore;
    }
}
