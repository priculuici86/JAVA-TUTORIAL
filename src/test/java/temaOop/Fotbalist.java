package temaOop;

import java.util.Arrays;
import java.util.List;

public class Fotbalist extends Sportiv{
   private List<String>calitatiIndividualeFotbalist;

    public Fotbalist(String numeSportiv, String sportPracticat, String competitii, String tipTeren,
                     String clubSportiv, double valoareContract, String echipaSportiv, int varstaSportiv,
    List<String>calitatiIndividualeFotbalist) {
        super(numeSportiv, sportPracticat, competitii, tipTeren, clubSportiv, valoareContract, echipaSportiv,
                varstaSportiv);
        this.calitatiIndividualeFotbalist=calitatiIndividualeFotbalist;
}
//OOP -
// CONCEPT
public void rezumatFotbalist() {
        rezumatComanda();
    System.out.println("Calitatile individuale ale fotbalistului sunt: "+calitatiIndividualeFotbalist);
}
// POLIMORFISM DINAMIC -CONCEPT
public void sportivulSeAntreneaza(){
    System.out.println("Fotbalistii se antreneaza 3 ore pe zi");
}
//POLIMORFISM STATIC -CONCEPT
    public void fotbalistulAlearga(String laAntrenament){
        System.out.println("Un fotbalist alearga de obicei "+laAntrenament);
    }
    public void fotbalistulAlearga(int km ){
        System.out.println("Fotbalistul alearga  intr-un meci minim "+km+"km");
    }

    public List<String> getCalitatiIndividualeFotbalist() {
        return calitatiIndividualeFotbalist;
    }

    public void setCalitatiIndividualeFotbalist(List<String> calitatiIndividualeFotbalist) {
        this.calitatiIndividualeFotbalist = calitatiIndividualeFotbalist;
    }
}



