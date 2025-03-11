package temaOopAbstractizareInterfete;

public class AfacereCafenea extends Afacere implements Cafenea{
    private String bauturiCalde;
    private String bauturiRacoritoare;
    private String bauturiAlcoolice;
    private int pretBauturi;

    public AfacereCafenea(String tipActivitate, String punctDeLucru, int numarAngajati) {
        super(tipActivitate, punctDeLucru, numarAngajati);
        this.bauturiCalde = bauturiCalde;
        this.bauturiRacoritoare=bauturiRacoritoare;
        this.bauturiAlcoolice =bauturiAlcoolice;
        this.pretBauturi=pretBauturi;
    }
    public void rezumatCafenea(){
        System.out.println("Bauturile calde sunt"+bauturiCalde);
    }


    @Override
    public void tipBauturi() {

    }

    @Override
    public void furnizoriBauturi() {

    }

    @Override
    public void preturiBauturi() {

    }
}
