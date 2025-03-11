package temaOop;

import java.util.List;

public class Tenismen extends Sportiv{
    private List<String>calitatiTenismen;


    public Tenismen(String numeSportiv, String sportPracticat, String competitii, String tipTeren,
                    String clubSportiv, double valoareContract, String echipaSportiv, int varstaSportiv, List<String>calitatiTenismen) {
        super(numeSportiv, sportPracticat, competitii, tipTeren, clubSportiv, valoareContract, echipaSportiv, varstaSportiv);
        this.calitatiTenismen = calitatiTenismen;
    }

    public Tenismen(String tipTeren, double valoareContract, List<String> calitatiTenismen) {
        super(tipTeren, valoareContract);
        this.calitatiTenismen = calitatiTenismen;
    }

    public void rezumatTenismen(){
        rezumatComanda();
        System.out.println("Calitatile tenismenei sunt: "+calitatiTenismen);

    }
    public void sportivulSeAntreneaza(){
        System.out.println("Tenismenul participa saptamanal la concursuri");
    }

    public List<String> getCalitatiTenismen() {
        return calitatiTenismen;
    }

    public void setCalitatiTenismen(List<String> calitatiTenismen) {
        this.calitatiTenismen = calitatiTenismen;
    }
}
