package oOp;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OopTest {

    @Test
    public void metodaTest() {
        Volvo comanda1 = new Volvo("Volvo", 50000, "xxx5", 2025, "motorina",
                Arrays.asList("incalzire in scaune", "climatizare", "piele"));
        comanda1.rezumatVolvo();
        comanda1.pornesteMotor();
        System.out.println();




        Volvo comanda2 = new Volvo("Volvo", 55500, "fgv", 2023, "diesel",
                Arrays.asList("camera", "piele"));
        comanda2.rezumatVolvo();
        System.out.println();


        Dacia comanda3 = new Dacia("Dacia", 16000, "Logan", 2025, "Gaz ",
                Arrays.asList("Oglinzi degivrante", "Stergatoare senzori"));
        comanda3.rezumatDacia();
        comanda3.pornesteMotor();
        comanda3.aplicareDiscount();
        comanda3.aplicareDiscount(10);
        comanda3.aplicareDiscount("Cupon pensie");
        System.out.println();

        Ford comanda4 = new Ford("Ford", 40000, "xx", 2024, "Diesel",
                Arrays.asList("Camera spate", "Piele"), Arrays.asList("Stergatoare senzori", "Oglinzi degivrante"));
        comanda4.rezumatFord();
        comanda4.pornesteMotor();




    }
}
