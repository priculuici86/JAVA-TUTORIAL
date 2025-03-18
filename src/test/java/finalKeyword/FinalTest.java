package finalKeyword;

import org.testng.annotations.Test;

public class FinalTest {
    //Variabila= proprietate care isi poate modifica valoarea
    //Constanata= nu-si poate modifica val
    // Scopul unei constante poate sa fie acela de a pastra aceleasi valori in intreg proiectul

    public final String user = " AnaI@yahoo.com";
    public final String password="123parola" ;
    @Test
    public void loginTest(){
//        user= " AnaI@yahoo.com";
//        password="123parola";

        System.out.println("Userul s-a logat cu succes lolosind :" +user+ "si parola"+password);

//        user = "kkk";
//        password= "ana86";
//        System.out.println("Userul s-a logat cu succes lolosind :" +user+ "si parola"+password);
    }
}
