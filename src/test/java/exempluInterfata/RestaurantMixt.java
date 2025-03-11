package exempluInterfata;

public class RestaurantMixt extends Restaurant implements Vegan,NonVegan {
    public RestaurantMixt(String nume, String specific, String meniu, String locatie, int capacitateLocuri) {
        super(nume, specific, meniu, locatie, capacitateLocuri);
    }

    @Override
    public void tipCarne() {

    }

    @Override
    public void preparateCarne() {

    }

    @Override
    public void bucatarCalificatSpecialitatiCarne() {

    }

    @Override
    public void furnizoriProduseCarne() {

    }

    @Override
    public void preparateVegane() {

    }

    @Override
    public void bucatarCalificatSpecialitatiVegane() {

    }

    @Override
    public void furnizoriProduseVegane() {

    }
}
