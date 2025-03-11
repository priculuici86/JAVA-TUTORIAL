package temaObiectConctructor;

import org.testng.annotations.Test;

public class ClubSportiv {

    @Test
    public void metodaTest(){
Sportivi Inot200m=new Sportivi("Ioan Popescu", 15,"Inot",
        "Juniori", 50.300, "Stafeta " );
Inot200m.rezumat();

        System.out.println();
    Sportivi Inot100m = new Sportivi("David Popovici", 20, "Inot" ,
            "Seniori", 10.5000, 2);
    Inot100m.rezumat();



    }

}
