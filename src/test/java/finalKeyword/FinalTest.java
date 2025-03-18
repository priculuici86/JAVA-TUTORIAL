package finalKeyword;

import org.testng.annotations.Test;

public class FinalTest {
    //FINAL = are ca rol sa primeasca o valoare si sa ne asigure ca acea val. nu se mai modifica niciodata/
    // e practic o Constanta ( ex credentialele care nu se schimba)
    //Variabila= proprietate care isi poate modifica valoarea
    //Constanata= nu-si poate modifica val
    // Scopul unei constante poate sa fie acela de a pastra aceleasi valori in intreg proiectul
    // Fara "final" propr. unei metode se pot modifica si ne poate afecta in cazul in care noi folosim prpr.
    // numai cu valoarea anterioara (ex: ne logam cu ac usr parola de fiecare data, nu se schimba)
    // tot in metoda se pun si valorile, ca conceptul sa stie de ele, si sa nu te m. lase sa le modifici in alta parte,
    //Singurul loc unde poti sa le modifici este in metoda initiala unde le-ai scris.
    // Final funct. f.bine cu Static, pt ca pt acces. propr. ai nevoie de un obiect, doar dc faci cu final
    //A.i.v. ca Constanta primeste o val nu prea merita sa faci un ob. dar vine in combinatie cu static
    //final , strict  pt fafpul sa poti accesa direct cand ii dai ca param. clasa pe care o ai cum ar fi aici
    //FinalTest, la nivel de Java, se reg. in forma asta cu STATIC FINAL, mai poate fi si STATIC SIMPLU. dar m. rar
    // pt beneficiile ca: FINAL - nu se modifica si STATIC- il accesezi de unde vrei .

    public final String user = " AnaI@yahoo.com";
    public final String password = "123parola";

    @Test
    public void loginTest() {

        System.out.println("Userul s-a logat cu succes lolosind :" + user + "si parola" + password);

    }
}
