package multimi;

import org.testng.annotations.Test;

import java.util.*;

public class Multimi {

    //Multimi= array, list, map

    @Test
    public void testMetoda() {
        afisareColegi();
//        afisareColegi2();
//          numeColegi();
//        numeColegiLengh();
//        afisareProduseV1();
//        afisareProduseV2();
//        carteRetete();


    }

    //Afisam numele colegilor curs-array
    //Pt a adauga colegi putem modifica nr peste tot(3 in 4),
    // dar mai eficient este sa introduci la conditia 2 din for, functia lenght-Ex:
    // " index < colegi.length;" astfel e mai eficient si modificam doar la String nr.si introd.val.

//  MULTIMI    T. ARRAY
    public void afisareColegi() {
        String[] colegi = new String[3];
        colegi[0] = "Iancu, Dragan";
        colegi[1] = "Ana";
        colegi[2] = "Roxana";
        for (int index = 0; index < colegi.length; index++) {
            System.out.println("Numele colegului meu este " + colegi[index]);
        }
    }
    //Afisam numele colegilor curs - MULTIMI T. LISTA

    public void afisareColegi2() {
        List<String> colegi = new ArrayList<>();
        colegi.add("Iancu");
        colegi.add("Ana");
        colegi.add("Roxana");
        for (int index = 0; index < colegi.size(); index++) {
            System.out.println("Numele colegului meu este " + colegi.get(index));
        }
    }

    //Afisam numele colegilor -array
    public void numeColegi() {
        String[] cursanti = new String[4];
        cursanti[0] = "Ana";
        cursanti[1] = "Tudor";
        cursanti[2] = "Vlad";
        cursanti[3] = "Maria";
        for (int index = 0; index < 4; index++) {
            System.out.println("Numele cursantului este  " + cursanti[index]);
        }
    }

    //Afisam numele colegilor -array / mai adaugam 2 nume "lenght"
    public void numeColegiLengh() {
        String[] cursanti = new String[6];
        cursanti[0] = "Ana";
        cursanti[1] = "Tudor";
        cursanti[2] = "Vlad";
        cursanti[3] = "Maria";
        cursanti[4] = "Crin";
        cursanti[5] = "Crina";
        for (int index = 0; index < cursanti.length; index++) {
            System.out.println("Numele cursantului este  " + cursanti[index]);
        }
    }

// Map = key -value         T.  MAP

    public void afisareProduseV1() {
        Map<String, String> raion = new HashMap<>();
        raion.put("raftul 1", "Paine");
        raion.put("raftul 2", "Cereale");
        raion.put("raftul 3", "Ciocolata");

        // Folosire Map ca tip de MULTIMI (array/List) si ForEach- ca Str Repetitiva/Parcurgere (for/While)
        // ForEach e str.Repetitiva folosita la Map pt parcurgere
        for (String key : raion.keySet()) {

            System.out.println("Raftul curent este:" + key);
            System.out.println("Produsul de pe raftul curent este:" + raion.get(key));
        }

    }
// Afisare o multime de prod(lista) si mai multe chei/rafturi
    public void afisareProduseV2() {
        Map<String, List<String>> raion = new HashMap<>();
        List<String> produseRaft1 = new ArrayList<>();
        produseRaft1.add("Lapte");
        produseRaft1.add("Mere");
        produseRaft1.add("Banane");

        List<String> produseRaft2 = new ArrayList<>();
        produseRaft2.add("Struguri");
        produseRaft2.add("Amandine");
        produseRaft2.add("Eclere");

        List<String> produseRaft3 = new ArrayList<>();
        produseRaft3.add("Apa");
        produseRaft3.add("Branza");

        raion.put("raft 1", produseRaft1);
        raion.put("raft 2", produseRaft2);
        raion.put("raft 3", produseRaft3);

        // Folosire Map ca tip de MULTIMI (array/List) si ForEach- ca Str Repetitiva/Parcurgere (for/While)

        for (String key : raion.keySet()) {

            System.out.println("Raftul curent este:" + key);
            System.out.println("Produsele de pe raftul curent sunt:" + raion.get(key));
        }
    }
    public void carteRetete(){
        Map <String, List <String>> retete=new LinkedHashMap<>();
        List<String>ingredienteCiorba=new ArrayList<>();
        ingredienteCiorba.add("3 cepe");
        ingredienteCiorba.add("2 morcovi");
        ingredienteCiorba.add("2 ardei");

        List<String> ingredienteTocana=new ArrayList<>();
        ingredienteTocana.add("1 kg cartofi");
        ingredienteTocana.add("2 cepe");
        ingredienteTocana.add("3 morcovi");

        List<String> ingredientePapanasi=new ArrayList<>();
        ingredientePapanasi.add("3 oua");
        ingredientePapanasi.add("0.5 kg faina");
        ingredientePapanasi.add("0.300 L lapte");

        retete.put("Ciorba", ingredienteCiorba );
        retete.put("Tocana", ingredienteTocana);
        retete.put("Papanasi", ingredientePapanasi);

        for(String key: retete.keySet()){

            System.out.println( "Pentru a face " +key+ " avem nevoie de: ");
            System.out.println(retete.get(key));
        }



    }
}