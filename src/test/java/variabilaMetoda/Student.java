package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    //int-un fisier java recunoastem o clasa dupa cuvantu"class"
    //orice clasa trebuie sa aiba un nume
    //intr-un fisier java putem avea m multe clase diferentiate prin numele lor
    //nu este  o buna practica sa ai m multe clase  intr-un fisier
    //tot codul care apartine unei clase se regaseste intre acolade
    //clasa=sablon, care contine Variabile si Metode despre un anumit exemplu
    //intr-o clasa putem avea n Variabile si n Metode
    //Proprietate = Variabila in java
    //Variabila = proprietatea unei clase
    //exista 2 tipuri de variabile: Globala si Locala
    //Var. Globala= proprietatea care e vizibila peste tot in progr nostru
    //Structura Var. Globala: public tip variabila, nume variabila
    //Var. locala=proprietatea care e vizibila doar in locul in care ai declarat-o
    //Structura Var. Locala: tip variabila, nume variabila
    //nu e oblig ca o var sa aiba o valoare
    //in java exista conceptu de primitiva si nonprimitiva
    //primitiva se bazeaza pe initializarea une valori
    //nonprimitiva se baz. pe instantierea unei var prin referinta
    //metoda=actiunea unei clase
    //exista 2 tipuri de metode: void si return
    //structura metoda void: public void nume metoda(){}
    public String nume;
    public String prenume;
    public int varsta;
    public String adresa;
    public double inaltime;
    public float greutate;
    public char gen;
    public boolean areBursa;
@Test
    public void prezentareStudent (){
        nume= "Iancu ";
        prenume= "Ana";
        varsta=38;
        adresa="Calea Romanilor 34";
        inaltime= 1.7;
        greutate=58.5f;
        gen='F';
        areBursa= true;

        System.out.print(nume);
        System.out.print(prenume);
        System.out.print(nume+prenume);
        System.out.print(nume+' '+prenume+' '+varsta);

        System.out.println("Numele si prenumele studentului este:"+nume+' '+prenume);
        System.out.println("Varsta studentului este:"+varsta);
        System.out.println("Adresa studentului este:"+adresa);
        System.out.println("Inaltimea studentului este:"+inaltime);
        System.out.println("Greutatea studentului este:"+greutate);
        System.out.println("Genul studentului este:"+gen);
        System.out.println("Studentul are bursa?"+areBursa);

        calculMedieStudent(10,9);
        calculMedieStudent(9,9);
        calculMedieStudent(7,8);
        calculMedieStudent3(8,8,8);
        calculMedieStudent3(8,8,9);
        calculMedieStudentInformatica(6, 6);
        calculMedieStudentInformatica3Note(7,7,8);
        calculPrezentaStudentInformaticaDinTotal5Cursuri(1,1,1,1);
        calculMedieStudent2Note();

    }
//VARIABILA LOCALA: ????????????????

    // o noua metoda care calculeaza  media unui student
    // o metoda poate sau nu sa contina parametri
    public void calculMedieStudent (double nota1, double nota2){

    double medie= (nota1+nota2)/2;

        System.out.println("Media studentului este:"+medie);
    }

    public void calculMedieStudent3 (double nota1, double nota2, double nota3){

        double medie= (nota1+nota2+nota3)/3;

        System.out.println("Media studentului este:"+medie);
    }

    //TEMA TEMA TEMA..Metoda parametri

    public void calculMedieStudentInformatica(double nota1, double nota2){

     double medie=(nota1+nota2)/2;

     System.out.println("Media studentului la informatica este:"+medie);
    };

    public void calculMedieStudentInformatica3Note(double nota1, double nota2,double nota3){

        double medie=(nota1+nota2+nota3)/3;

        System.out.println("Media studentului la informatica este:"+medie);
    };


    public void calculPrezentaStudentInformaticaDinTotal5Cursuri(double curs1, double curs2, double curs3, double curs4){

        double prezenta=( curs1+curs2+curs3+curs4)/5*100;

        System.out.println("Prezenta in % la cele 5 cursuri  a studentului la informatica este:"+prezenta);


    };


    public void calculMedieStudent2Note (){

        double nota1= 4;
        double nota2= 6;
        double medie= (nota1+nota2)/2;

        System.out.println("Media studentului este:"+medie);
    }



};
