package exempluInterfata;

public class RestaurantNonVegan extends Restaurant implements  NonVegan{
    private String bauturiVegane;
    private String deserturiVegane;

    public RestaurantNonVegan(String nume, String specific, String meniu, String locatie, int capacitateLocuri) {
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
}
