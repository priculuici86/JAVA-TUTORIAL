package temaOopAbstractizareInterfete;

import com.beust.ah.A;

public class AfacereCofetarie extends Afacere implements Cofetarie {

    public AfacereCofetarie(String tipActivitate, String punctDeLucru, int numarAngajati) {
        super(tipActivitate, punctDeLucru, numarAngajati);
    }

    @Override
    public void feluriPrajituri() {

    }

    @Override
    public void furnizoriIngrediente() {

    }

    @Override
    public void personalCalificat() {

    }
}
