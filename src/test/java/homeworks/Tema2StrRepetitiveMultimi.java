package homeworks;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Tema2StrRepetitiveMultimi {

    @Test
    public void metodaTest() {
//        afisareProduseCos();
//        afisareProduseCos2();
//        afisareFructeCos();
//        afisareDa5();
//        afisareNrMaiMare();
//        afisareNrMaiMic();
//        afisamNrPareImpare();
//        afisareNrPare();
//        sumaNumere();
//        sumaNr10();
//        afisareProdusNr();
//        afisamNrDivizibile();
//        afisam3NrDivizibile5();
        afisam10Nr();
//        afisamPrimele5NrDivizibile3();

    }


// 1  afisare 5 produse alimentare din cos - Multimi/ array

    public void afisareProduseCos() {
        String[] produse = new String[5];
        produse[0] = "iaurt";
        produse[1] = "lapte";
        produse[2] = "cascaval";
        produse[3] = "smantana";
        produse[4] = "telemea";
        for (int index = 0; index < 5; index++) {
            System.out.println("Un produs din cos este: " + produse[index]);
        }

    }
    // 1.1  afisare 5 produse alimentare din cos - Multimi/ List

    public void afisareProduseCos2() {
        List<String> produse = new ArrayList<>();
        produse.add("iaurt");
        produse.add("lapte");
        produse.add("cascaval");
        produse.add("smantana");
        produse.add("telemea");
        for (int index = 0; index < produse.size(); index++) {
            System.out.println("Un produs din cos este: " + produse.get(index));
        }
    }
    // 2. Afisare fructe in cos Multimi -array/ while

    public void afisareFructeCos() {
        String[] fructe = new String[4];
        fructe[0] = "mere";
        fructe[1] = "pere";
        fructe[2] = "rodii";
        fructe[3] = "struguri";
        int index = 0;
        while (index < fructe.length) {
            System.out.println("In cos sunt: " + fructe[index]);
            index++;
        }
    }
    //Cerinta 1. Afisam in consola de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre; -for


    public void afisareDa5() {
        for (int index = 0; index < 5; index++) {
            System.out.println(index + "DA");
        }
    }
//2. Afisam in consola primele 3 numere de la 1 la 3;-for

    public void afisareNr() {


        for (int index = 1; index < 4; index++) {
            System.out.println(index);
        }
    }

    //3. Afisam in consola numarul cel mai mare dintre 15 si 20; Se vor declara variabile
    //a.i sa nu harcodam valoarea in metoda;

    public void afisareNrMaiMare() {
        int nrMaiMare = 20;
        int nrMaiMic = 15;
        if (nrMaiMare > nrMaiMic) {
            System.out.println(nrMaiMare);
        } else {
            System.out.println(nrMaiMic);
        }
    }
    // 4. Afisam in consola numarul cel mai mic dintre 4.5 si 3.25; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;

    public void afisareNrMaiMic() {
        double nrMaiMare = 4.5;
        double nrMaiMic = 3.25;
        if (nrMaiMic < nrMaiMare) {
            System.out.println(nrMaiMic);

        }
    }
    //5. Afisam in consola numerele pare si numerele impare pana la 10 (utilizam "for");

    public void afisamNrPareImpare() {
        int nrPare = 0;
        int nrImpare = 0;
        for (int index = 0; index < 10; index++) {
            if (index % 2 == 0) {
                nrPare++;
            } else {
                nrImpare++;
            }
        }
        System.out.println("Nr pare sunt: " + nrPare);
        System.out.println("Nr Impare sunt: " + nrImpare);
    }
//6. Afisam in consola doar numerele pare pana la 10 (utilizam "for");

    public void afisareNrPare() {
        int nrPare = 0;
        int nrImpare = 0;
        for (int index = 0; index < 10; index++) {
            if (index % 2 == 0) {
                nrPare++;
            } else {
                nrImpare++;
            }
        }
        System.out.println("Nr pare sunt: " + nrPare);
    }

    // 8.Afisam in consola suma a doua numere 235 si 10; Se vor declara variabile LOCALE;
    public void sumaNumere() {
        int nr1 = 235;
        int nr2 = 10;
        int sumaNr = nr1 + nr2;
        System.out.println("Suma celor doua numere este: " + sumaNr);

    }
//10. Afisam in consola suma numerelor pana la 10 (int suma=0); Se vor declara variabile LOCALE;

    public void sumaNr10() {
        int sumaNr = 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;
        System.out.println("Suma nr panala 10 este: " + sumaNr);
    }
// 11. Afisam in consola produsul numerelor pana la 5; Se vor declara variabile LOCALE;

    public void afisareProdusNr() {
        int produsNr = 0 * 1 * 2 * 3 * 4;
        System.out.println("Produsul nr pana la 5 este: " + produsNr);
    }


//7. ?? Afisam in consola numerele divizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;

    public void afisamNrDivizibile() {
        int nr1 = 33;
        int nr2 = 40;
        int nr3 = 45;

        if (nr1 % 5 == 0) {
            System.out.println("Nr 1: " + nr1 + "- este divizibil cu 5");
        }
        if (nr2 % 5 == 0) {
            System.out.println("Nr 2: " + nr2 + "- este divizibil cu 5");
        }
        if (nr3 % 5 == 0) {
            System.out.println("Nr 3: " + nr3 + "- este divizibil cu 5");
        }
    }
//8.?? Afisam in consola primele 3 numere dibizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;

    public void afisam3NrDivizibile5() {

        int nrAfisate = 3;
        int nrDivizibilLa5 = 5;

        System.out.println("Primele 3 nr divizibile cu 5 sunt: ");

        int index = 0;
        while (index < 3) {
            if ((nrDivizibilLa5 % 5 == 0)) {
                System.out.println(nrDivizibilLa5);
                index++;
            }
            nrDivizibilLa5++;
        }
    }
//?????????? CUM AFISAM  DINTR-UN SIR DE NR ALEATORII   PRIMELE 3/ ULTIMELE 5 SAU CRESCATOR/DESCRESCATOR
    //Afisare primele10/ ultimele 5... nr din intervalul 0-50
    public void afisam10Nr() {
        int nrTotal = 50;
        for (int index = 50; index >= 45; index--) {
            System.out.println(index);
        }
    }

    //DIVIZIBILITATEA-    if (divizor%6==0  )
    public void afisamPrimele5NrDivizibile3() {
        int divizor = 6;
        int nrAfisate = 5;
        System.out.println("Primele 5 nr divizibile cu 3 sunt:");
        int index = 0;
        while (index < nrAfisate) {
            if (divizor % 6 == 0) {
                System.out.println(divizor);
                index++;
            }
            divizor++;

        }
    }
}

