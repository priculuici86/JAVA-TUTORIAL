package exempluInterfata;

public class Restaurant {

    private String nume;
    private String specific;
    private String meniu;
    private  String locatie;
    private int capacitateLocuri;

    public Restaurant(String nume, String specific, String meniu, String locatie, int capacitateLocuri) {
        this.nume = nume;
        this.specific = specific;
        this.meniu = meniu;
        this.locatie = locatie;
        this.capacitateLocuri = capacitateLocuri;
    }
    public void infoRestaurant(){
        System.out.println("Numele restaurantului este "+nume);
        System.out.println("Specificul restaurantulu este "+specific);
        System.out.println("Meniul restaurantului este " +meniu);
        System.out.println("Locatia restaurantului este "+locatie);
        System.out.println("Capacitatea restaurantului are" +capacitateLocuri+"locuri");
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getSpecific() {
        return specific;
    }

    public void setSpecific(String specific) {
        this.specific = specific;
    }

    public String getMeniu() {
        return meniu;
    }

    public void setMeniu(String meniu) {
        this.meniu = meniu;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public int getCapacitateLocuri() {
        return capacitateLocuri;
    }

    public void setCapacitateLocuri(int capacitateLocuri) {
        this.capacitateLocuri = capacitateLocuri;
    }
}
