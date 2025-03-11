package exempluInterfata;

public class RestaurantVegan extends Restaurant implements NonVegan{
    private String preparatePui;
    private String preparatePorc;
    private String tipCarneDecates;

    public RestaurantVegan(String nume, String specific, String meniu, String locatie, int capacitateLocuri) {
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
