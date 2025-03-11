package temaOop;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SportivTest {
    @Test
    public void metodaTest(){
        Fotbalist achizitieNr1=new Fotbalist("Vlad Chiriches", "Fotbal", "Turneu national", "National Arena"
                , "Steaua", 200.000,    "FCSB", 30, Arrays.asList("Tehnica", "Joc de cap bun", "Rezistenta"));
        achizitieNr1.rezumatFotbalist();
        //Polimorfism dinamic
        achizitieNr1.sportivulSeAntreneaza();

        //Polimorfism static
        achizitieNr1.fotbalistulAlearga(10);
        achizitieNr1.fotbalistulAlearga("2h");
        System.out.println();

        Tenismen achizitieNr2=new Tenismen("Simona Halep", "Tenis", "Rolan Garo",
                "Zgura", "Steaua", 30.000,"Fete", 37,
                Arrays.asList( "Rezistenta", "Precizie" ));
        achizitieNr2.rezumatTenismen();
        //Polimorfism dinamic
        achizitieNr2.sportivulSeAntreneaza();
        System.out.println();

    }
}






