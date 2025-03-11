package structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {
    // STRUCTURI REPETITIVE = for, wile, for each

    @Test
    public void testMethod() {
//        afisamNnumere();
//        afisamNnumere1();
//        afisamNnumere2();
//        afisamNumerePare();
//        calculNumerePare();
//          afisareNr20();
//          afisareNr100();
//        afisareNrWile100();
        afisareNrPare100();
    }
//Afisam primele 10 numere cu "for"

    public void afisamNnumere() {

        for (int index = 0; index < 10; index = index + 1) {

            System.out.println(index);
        }
    }
    //Afisam primele 10 numere asa  va fi afisat

    public void afisamNnumere1() {

        for (int index = 0; index < 10; index++) {

            System.out.println(index);
        }
    }
    //Afisam primele 10 numere cu "wile"
    public void afisamNnumere2() {
        int index = 0;
        while (index <= 50) {
            System.out.println(index);
            index++;
        }
    }
    //Afisam nr pare de la 0la 50 ???
    public void afisamNumerePare() {
        for (int index = 0; index <= 50; index++) {
            if (index % 2 == 0) {
                System.out.println("numarul " + index + " este par");
            }
        }
    }
    //Calculam cate nr pare si impare avem intr-un interval
    public void calculNumerePare() {
        int nrPare = 0;
        int nrImpare = 0;
        for (int index = 0; index <= 50; index++) {
            if (index % 2 == 0) {
                nrPare++;
            } else {
                nrImpare++;
            }
        }
        System.out.println(("nr pare= " + nrPare));
        System.out.println(("nr impare= " + nrImpare));
    }
    //afisare nr de 1 la 20 cu for
    public void afisareNr20() {
        for (int index = 0; index <= 20; index++) {
            System.out.println(index);
        }
    }
//afisare nr de 1 la 100 cu for
    public void afisareNr100(){
          for (int index =0; index<=100; index++){
              System.out.println(index);
          }
        }
//afisare nr de 1 la 100 cu while
    public void afisareNrWile100(){
        int index =0;
        while (index<=100){
       System.out.println(index);
       index++;
        }
    }
    public void afisareNrPare100(){
        for (int index=0; index<=100; index++){
        if (index%2==0){
            System.out.println("Nr " +index+ " este par ");
        }
        }
    }

}




