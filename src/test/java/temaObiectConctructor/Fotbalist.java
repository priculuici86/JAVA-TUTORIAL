package temaObiectConctructor;

public class Fotbalist {

   public String NumeFotbalist ;
   public int VarstaFotbalist;
   public int Liga;
   public String Echipa;
   public String Pozitia;
   public double ValoareContract;
   public int NumarTricou;

   public Fotbalist(String numeFotbalist, int varstaFotbalist, int liga, String echipa, String pozitia,
   double valoareContract, int numarTricou) {
      this.NumeFotbalist = numeFotbalist;
      this.VarstaFotbalist = varstaFotbalist;
      this.Liga = liga;
      this.Echipa = echipa;
      this.Pozitia = pozitia;
      this.ValoareContract = valoareContract;
      this.NumarTricou = numarTricou;
   }

   public Fotbalist(String numeFotbalist, int varstaFotbalist, String echipa, String pozitia, double valoareContract, int numarTricou) {
      this.NumeFotbalist = numeFotbalist;
      this.VarstaFotbalist = varstaFotbalist;
      this.Echipa = echipa;
      this.Pozitia = pozitia;
      this.ValoareContract = valoareContract;
      this.NumarTricou = numarTricou;
   }

   public Fotbalist(String numeFotbalist, int varstaFotbalist, int liga, String echipa, String pozitia, double valoareContract) {
      this.NumeFotbalist = numeFotbalist;
      this.VarstaFotbalist = varstaFotbalist;
      this.Liga = liga;
      this.Echipa = echipa;
      this.Pozitia = pozitia;
      this.ValoareContract = valoareContract;
   }

   public Fotbalist(String numeFotbalist, int varstaFotbalist) {
      this.NumeFotbalist = numeFotbalist;
      this.VarstaFotbalist = varstaFotbalist;
   }

   public void rezumat (){

      System.out.println("Numele fotbalistului este:"+NumeFotbalist);
      System.out.println("Varsta fotbalistului este: "+VarstaFotbalist);
      if (Liga!=0)
      System.out.println("Liga in care joaca fotbalistul est: "+Liga);
      if (Echipa!=null)
      System.out.println("Echipa la care joaca fotbalistul este: "+Echipa);
      if (Pozitia!=null)
      System.out.println("Pozitia pe care joaca fotbalistul este: "+Pozitia);

      if (ValoareContract!=0)
      System.out.println("Valoarea contractului anual este: "+ValoareContract);
      if (NumarTricou!=0)
      System.out.println("Numarul tricoului este: "+NumarTricou);
   }
}
