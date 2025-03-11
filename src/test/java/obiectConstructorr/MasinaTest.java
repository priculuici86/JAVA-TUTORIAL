package obiectConstructorr;

import org.testng.annotations.Test;

public class MasinaTest {

  @Test
  public void testMethod() {
    Masina comanda1 = new Masina("Volvo", " xx5", "disel", 5, 2025, 50500);
    comanda1.rezumat();

    System.out.println();

    Masina camanda2=new Masina("Audi", "A6","benzina",  7,2025);
    camanda2.rezumat();

    System.out.println();

    Masina camanda3=new Masina("BMW", "X5","gaz",  5,2023);
    camanda3.rezumat();

  }
}




