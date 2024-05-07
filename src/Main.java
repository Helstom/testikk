
public class Main {
    public static void main(String[] args) {

        // instance Ctverec , Obdelnik , Kruh
      Ctverec ctv = new Ctverec(0);
      Obdelnik obd = new Obdelnik(0,0);
      Kruh kru = new Kruh(0);

      //metody tridy Ctverec
        // vezme data od uzivatele
      ctv.dataCollect();
        // vypocita obvod a obsah
      ctv.obvod();
      ctv.obsah();




        //metody tridy Obdelnik
        // vezme data od uzivatele
      obd.dataCollect();
        // vypocita obvod a obsah
      obd.obvod();
      obd.obsah();



        //metody tridy Kruh
        // vezme data od uzivatele
        kru.dataCollect();
         // vypocita obvod a obsah
         kru.obvod();
        kru.obsah();


    }
}