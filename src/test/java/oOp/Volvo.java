package oOp;

import java.util.List;

public class Volvo extends Masina {

    private List<String> dotariInterioare;


    public Volvo(String marca, int pret, String model, int anFabricatie, String combustibil,
                 List<String> dotariInterioare) {
        super(marca, pret, model, anFabricatie, combustibil);
        this.dotariInterioare = dotariInterioare;
    }

    public void rezumatVolvo() {
        rezumatComanda();
        System.out.println("Dotarile interioare sunt: " + dotariInterioare);

    }

    //Polimorfism dinamic
    public void pornesteMotor(){
        System.out.println("Masinile Volvo pornesc fara cheie");
    }

    //INCAPSULARE:

    public List<String> getDotariInterioare() {
        return dotariInterioare;
    }

    public void setDotariInterioare(List<String> dotariInterioare) {
        this.dotariInterioare = dotariInterioare;
    }
}

