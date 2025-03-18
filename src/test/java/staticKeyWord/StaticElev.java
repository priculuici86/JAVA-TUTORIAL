package staticKeyWord;

import org.testng.annotations.Test;

public class StaticElev {
    @Test

    public void  metodaTest(){
        Elev elev1 = new Elev( "Mircea", "Radu", 13, "7", "Liviu Rebreanu");
        elev1.infoElev();
        System.out.println();

        Elev elev2 = new Elev( "Mar", "Marcu", 11, "5", "Liviu Rebreanu");
        elev2.infoElev();
        System.out.println();

        Elev elev3 = new Elev( "Nan", "Mihai", 15, "11", "Liviu Rebreanu");
        elev3.infoElev();

    }

}
