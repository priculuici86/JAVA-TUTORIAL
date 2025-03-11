package temaObiectConctructor;

import org.testng.annotations.Test;

public class ImpresarFotbalist {


    @Test
    public void testMethod(){

    Fotbalist nr1 = new Fotbalist("Iancu George", 37, 1,"UTA Arad", "Fundas dreapta", 150500, 5);
    nr1.rezumat();
   System.out.println();

    Fotbalist nr2 = new Fotbalist("Banu  Ioan", 30,"UTA Arad", "Fundas stanga", 200500,25);
    nr2.rezumat();

    System.out.println();
    Fotbalist nr3 = new Fotbalist("Postelnic  Eugen", 30, 1,"UTA Arad", "Fundas stanga", 20500);
     nr3.rezumat();
      System.out.println();

      Fotbalist nr4 = new Fotbalist("Moldovan Andrei",20);
      nr4.rezumat();

    }
}
