package homeworks;

import org.testng.annotations.Test;

public class ProgramareTema1 {

    public String salutari;
    public int varsta;
    public String nume;
    public String prenume;
    public char salut;
    public char completare;
    public char detine;


    @Test
    public void cerinta1() {
        cerinta2();
        cerintaTrei3();
        cerinta3();
        cerinta4();
        cerinta5();
        cerinta6();
        printSalary("Andrei");
        afisareNrdepartament(200, 300, 100);
        printIdAngajat("Popescu");



        salutari = "Hello World";
        System.out.println("Salutul afisat este:" + salutari + "-" + ' ' + " Poti pleca acasa dupa ce iti verific munca!");
    }

    public void cerinta2() {
        varsta = 38;
        System.out.println("Varsta mea este:" + varsta + "-" + ' ' + " Poti pleca acasa dupa ce iti verific munca!");
    }

    public void cerintaTrei3() {
        nume = "Vieru";
        System.out.println("Numele meu este:" + nume + "-" + ' ' + " Poti pleca acasa dupa ce iti verific munca!");
    }

    public void cerinta3() {
        prenume = "Maria";
        System.out.println("Prenumele meu este:" + prenume + "-" + ' ' + " Poti pleca acasa dupa ce iti verific munca!");
    }

    public void cerinta4() {
        salut = 'M';
        System.out.println("Salut" + salut + "-" + ' ' + " Poti pleca acasa dupa ce iti verific munca!");
    }

    public void cerinta5() {
        completare = 'M';
        System.out.println(completare + "Hello" + "-" + ' ' + " Poti pleca acasa dupa ce iti verific munca!");
    }

    public void cerinta6() {
        detine = 'Z';
        System.out.println("Ana are: mere" + detine + ' ' + "pere" + detine + ' ' + "prune" + detine + "-" + ' ' + " Poti pleca acasa dupa ce iti verific munca!");
    }

    // Cerinta 8 -Afisam in consola salariul unui angajat daca acesta are prenumele Andrei;

    public void printSalary(String angajat) {
        switch (angajat) {
            case "Ioan":
                System.out.println("Ioan are salariul 5000 lei ");
                break;
            case "Ecaterina":
                System.out.println("Ecaterina are salariul 6000 lei ");
                break;
            case "Andrei":
                System.out.println("Andrei are salariul 2000 lei ");
                break;
            case "Florentina":
                System.out.println("Florentina are salariul 6000 lei ");
                break;

        }

    }

    //Cerinta 10 Utilizand o metoda cu parametrii afisati numarul unui departament daca acesta
    // este mai mare de 287;Alex Dorha -if (nr1 >287 || nr2>287 || nr3>287) {}

    public void afisareNrdepartament(int nr1, int nr2, int nr3) {
        if (nr1 > 287) {
            System.out.println("nr 1 departament " + '-' + nr1 + ' ' + " este > decat 287");
        } else if (nr2 > 287) {
            System.out.println("nr 2 departament " + '-' + nr2 + ' ' + " este > decat 287");
        } else if (nr3 > 287) {
            System.out.println("nr 3 departament" + '-' + nr3 + ' ' + "este > decat 287");
        }

    }
    // Cerinta 9Afisam in consola ID de angajat si Departamentul din care face parte un angajat
    // daca numele acestuia este "Popescu"
    public void printIdAngajat (String idAngajat) {
        switch (idAngajat) {
            case "Ionescu":
                System.out.println("Ionescu are Id 10 si face parte din departamentul de achizitii ");
                break;
            case "Ile":
                System.out.println("Ile are Id 11 si face parte din departamentul de transport ");
                break;
            case "Andronescu":
                System.out.println(" Andronescu are Id 12 si face parte din departamentul de logistica ");
                break;
            case "Popescu":
                System.out.println(" Popescu are Id 12 si face parte din departamentul de comenzi");
                break;
        }
    }

}






