package oOp;

import java.util.List;

public class Dacia extends Masina {

    private List<String>dotariExterioare;

    public Dacia(String marca, int pret, String model, int anFabricatie, String combustibil,
                 List<String>dotariExterioare) {
        super(marca, pret, model, anFabricatie, combustibil);
        this.dotariExterioare=dotariExterioare;
    }
    public void rezumatDacia(){
        rezumatComanda();
        System.out.println("Doatari exterioare Dacia: "+dotariExterioare);
    }

    //Polimorfism dinamic
    public void pornesteMotor(){
        System.out.println("Msinile Dacia porneste din buton");
    }

    //Polimorfism static
    public void aplicareDiscount (){
        System.out.println("Dacia nu ofera discount in aceasta perioada");
    }

    public void aplicareDiscount (int procent){
        System.out.println("Dacia  ofera discount de "+ procent+"%");
    }

    public void aplicareDiscount (String cupon){
        System.out.println("Dacia  aplica cuponul  urmator"+cupon);
    }

    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }
}







