package temaObiectConctructor;

public class Sportivi {

    public String NumeSportiv ;
    public int VarstaSportiv;
    public String SportPracticat;
    public String Echipa;
    public double ValoareContract;
    public int NumarTricou;
    public String Proba;

    public Sportivi(String numeSportiv, int varstaSportiv, String sportPracticat, String echipa,
                    double valoareContract, String proba) {
        this.NumeSportiv = numeSportiv;
        this.VarstaSportiv = varstaSportiv;
        this.SportPracticat = sportPracticat;
        this.Echipa = echipa;
        this.ValoareContract = valoareContract;
        this.Proba = proba;
    }

    public Sportivi(String numeSportiv, int varstaSportiv, String sportPracticat, String echipa,
                    double valoareContract, int numarTricou) {
        this.NumeSportiv = numeSportiv;
        this.VarstaSportiv = varstaSportiv;
        this.SportPracticat = sportPracticat;
        this.Echipa = echipa;
        this.ValoareContract = valoareContract;
        this.NumarTricou = numarTricou;
    }


    public void rezumat (){

        System.out.println("Numele sportivului este: "+NumeSportiv);
        System.out.println("Varsta sportivului este:"+VarstaSportiv);
        System.out.println("Sportul practicat:"+SportPracticat);
        System.out.println("Echipa din care face parte sportivul :"+Echipa);
        System.out.println("Valoare contract in euro: "+ValoareContract);
        if (NumarTricou!=0)
        System.out.println("Nr sportiv: "+NumarTricou);
        if (Proba!=null)
        System.out.println("Proba sportivului: "+Proba);
    }
}
