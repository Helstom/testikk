import java.util.Scanner;
import java.util.ArrayList;
public class Obdelnik extends  Obrazce{
    //nacitani od uzivatele
    Scanner user = new Scanner(System.in);
    //uklada hodnoty do list nazvu honodnoty
    ArrayList<Integer> hodnoty = new ArrayList<>();
    private int stranaB;

    public Obdelnik(int stranaA, int stranaB) {
        super(stranaA);
        this.stranaB = stranaB;
    }

    @Override
    public void dataCollect() {
        //zepta se usera o zadani informaci o obrazci
        System.out.println("napis stranu A obdelnik ");
        int stranaA = user.nextInt();
        System.out.println("napis stranu B obdelnik ");
        int stranaB = user.nextInt();

        if (stranaA == stranaB) {
        System.out.println("strany jsou stejne nejednase o obdelnik");
    }
        else {
        hodnoty.add(stranaA);
        hodnoty.add(stranaB);
        }
    }

    @Override
    public void obvod() {

        System.out.println("Obvod obdelniku");
        System.out.println((2*(hodnoty.get(0)+hodnoty.get(1))));
    }

    @Override
    public void obsah() {
        System.out.println("Obsah obdleniku");
        System.out.println((hodnoty.get(0)*hodnoty.get(1)));

    }
}
