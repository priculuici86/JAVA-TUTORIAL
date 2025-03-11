package oopAbstractizare1;

// Aici la interfata putem face doar metode abstracte ( fara public si {}), iar cand o implementam
// (aici in Cl.ElevPersoana), o transcrie intr-o met. cu void, adica cu body .
// Abstractizarea e efectuata prin "INTERFATA", ac. arata cu exactitate comportamentul ac.

public interface Elev {

    void prezenta();
    void studiu();
    void bursier();
    void areAbsente();
}

