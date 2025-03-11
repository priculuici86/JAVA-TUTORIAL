package structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    // Structuri alternative= If(conditie)   ...else, swich (value)..case

    @Test
    public void metodaTest() {

//        afisareNrMaiMare(5, 4);
//        afisareNrMaiMare(3, 8);
//        verificareNrParPozitiv(-2);
//        verificareNrParPozitiv(3);
//        verificareNrParPozitiv(0);
//        verificareNrParPozitiv(-3);
//        verificareNrParPozitiv(4);
           zileSaptamana(5);
           zileSaptamana(11);

    }

    // verificam care nr e mai mare dintre2 valori

    public void afisareNrMaiMare(int nr1, int nr2) {
        if (nr1 > nr2) {
            System.out.println("nr1 este mai mare  decat nr2");
        } else {
            System.out.println("nr1 nu este mai mare  decat nr2");
        }
    }

    // Pt a afisa mesajul cu valoare vom concatena valorile in mesaje (din System...

    public void afisareValNr(int nr1, int nr2) {
        if (nr1 > nr2) {
            System.out.println("nr1: " + nr1 + " este mai mare  decat nr2:" + nr2);
        } else {
            System.out.println("nr2: " + nr2 + " este mai mare  decat nr1:" + nr1);
        }
    }

    // verificam cand un nr este par

    public void verificareNrPar(int nr) {
        if (nr % 2 == 0) {
            System.out.println(nr + ": este par");
        } else {
            System.out.println(nr + ": nu este par ");
        }
    }
    // verificam daca un nr este pozitiv/ negativ/ si par/impar

    public void verificareNrParPozitiv(int nr) {
        if (nr > 0) {
            if (nr % 2 == 0) {
                System.out.println(nr + ": este par si pozitiv ");
            } else {
                System.out.println(nr + ":  este impar si pozitiv ");
            }
        } else if (nr < 0) {
            if (nr % 2 == 0) {
                System.out.println(nr + ":  este par si negativ ");
            } else {
                System.out.println(nr + ":  este impar si negativ ");
            }
        } else {
            System.out.println(" nr este egal cu 0 ");
        }


    }
    // afisam una dintre zilele saptamanii

    public void zileSaptamana(int zi) {
        switch (zi) {
            case 1:
                System.out.println("Astazi este luni ");
                break;
            case 2:
                System.out.println("Astazi este marti ");
                break;
            case 3:
                System.out.println("Astazi este miercuri ");
                break;
            case 4:
                System.out.println("Astazi este joi ");
                break;
            case 5:
                System.out.println("Astazi este vineri ");
                break;
            case 6:
                System.out.println("Astazi este sambata ");
                break;
            case 7:
                System.out.println("Astazi este duminica ");
                break;
            default:
                System.out.println("Numai sunt zile");

        }

    }
}