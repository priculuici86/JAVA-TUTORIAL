package oopAbstractizare1;


    public class ElevPersoana extends Persoana implements Elev{
//2. Aici avem Conceptul de MOSTENIRE
    private String scoala;
    private String clasa;

    public ElevPersoana(String nume, String prenume, int varsta, String scoala, String clasa) {
        super(nume, prenume, varsta);
        this.scoala = scoala;
        this.clasa = clasa;
    }

    public void rezumatElev(){
        infoPersoane();
        System.out.println("Scoala elevului este: "+ scoala);
        System.out.println(" Elevul este in clasa " +clasa);
    }
    // POLIMORFISMUL DINAMIC/ implementeaza propr. de la Elev cu "implements Elev"

        @Override
        public void prezenta() {

        }

        @Override
        public void studiu() {

        }

        @Override
        public void bursier() {

        }

        @Override
        public void areAbsente() {

        }
    }

