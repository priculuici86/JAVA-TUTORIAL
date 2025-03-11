package temaOopAbstractizareInterfete;

public class AfacereAlimentara extends Afacere implements Patiserie, Cofetarie, Cafenea{

    public AfacereAlimentara(String tipActivitate, String punctDeLucru, int numarAngajati) {
        super(tipActivitate, punctDeLucru, numarAngajati);
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

    @Override
    public void feluriPrajituri() {

    }

    @Override
    public void furnizoriIngrediente() {

    }

    @Override
    public void sortimentProdusePatiserie() {

    }

    @Override
    public void tipCoacere() {

    }

    @Override
    public void personalCalificat() {

    }
}
