
public class Main {
    public static void main(String[] args) {
      Ctverec test = new Ctverec(0);
      Obdelnik test2 = new Obdelnik(0,0);
      Kruh test3 = new Kruh(0);

      test.dataCollect();
      test.obvod();
      test.obsah();

      test2.dataCollect();
      test2.obvod();
      test2.obsah();

      test3.dataCollect();
      test3.obvod();
      test3.obsah();


    }
}