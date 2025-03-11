package temaOop;

public class Sportiv {

    private String numeSportiv;
    private String sportPracticat;
    private int varstaSportiv;
    private String echipaSportiv;
    private String clubSportiv;
    private double valoareContract;
    private String tipTeren;
    private String competitii;

    public Sportiv(String numeSportiv, String sportPracticat, String competitii, String tipTeren,
                   String clubSportiv, double valoareContract, String echipaSportiv, int varstaSportiv) {
        this.numeSportiv = numeSportiv;
        this.sportPracticat = sportPracticat;
        this.competitii = competitii;
        this.tipTeren = tipTeren;
        this.clubSportiv = clubSportiv;
        this.valoareContract = valoareContract;
        this.echipaSportiv = echipaSportiv;
        this.varstaSportiv = varstaSportiv;
    }

    public Sportiv(String tipTeren, double valoareContract) {
        this.tipTeren = tipTeren;
        this.valoareContract = valoareContract;
    }

    public void rezumatComanda(){
        System.out.println("Numele sportivului este: "+numeSportiv);
        System.out.println("Sportul practicat este: "+sportPracticat);
        System.out.println("Varsta sporivului este: "+varstaSportiv);
        System.out.println("Echipa sportivului este: "+echipaSportiv);
        System.out.println("Clubul de care apartine sportivul este: "+clubSportiv);
        System.out.println("Valoarea contractului anual este:"+valoareContract+"$");
        System.out.println("Tipul terenului de joc este: "+tipTeren);
        System.out.println("Competitii la care a participatsportivul:"+competitii);
    }

    public void sportivulSeAntreneaza(){
        System.out.println("Sportivul se antreneaza zilnic");

    }


    public String getNumeSportiv() {
        return numeSportiv;
    }

    public void setNumeSportiv(String numeSportiv) {
        this.numeSportiv = numeSportiv;
    }

    public String getSportPracticat() {
        return sportPracticat;
    }

    public void setSportPracticat(String sportPracticat) {
        this.sportPracticat = sportPracticat;
    }

    public int getVarstaSportiv() {
        return varstaSportiv;
    }

    public void setVarstaSportiv(int varstaSportiv) {
        this.varstaSportiv = varstaSportiv;
    }

    public String getEchipaSportiv() {
        return echipaSportiv;
    }

    public void setEchipaSportiv(String echipaSportiv) {
        this.echipaSportiv = echipaSportiv;
    }

    public String getClubSportiv() {
        return clubSportiv;
    }

    public void setClubSportiv(String clubSportiv) {
        this.clubSportiv = clubSportiv;
    }

    public String getTipTeren() {
        return tipTeren;
    }

    public void setTipTeren(String tipTeren) {
        this.tipTeren = tipTeren;
    }

    public String getCompetitii() {
        return competitii;
    }

    public void setCompetitii(String competitii) {
        this.competitii = competitii;
    }

    public double getValoareContract() {
        return valoareContract;
    }
}
