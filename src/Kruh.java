import java.util.ArrayList;
import java.util.Scanner;

public class Kruh {
    Scanner user = new Scanner(System.in);
    ArrayList<Integer> hodnoty = new ArrayList<>();
    private int r;

    public Kruh(int r) {
        this.r = r;
    }


    public void dataCollect() {
        System.out.println("Zapis polomer kruhu");
        int r = user.nextInt();
        hodnoty.add(r);
    }


    public void obvod() {
        System.out.println("Obvod kruhu");
        System.out.println(2*(Math.PI*hodnoty.get(0)));
    }


    public void obsah() {
        System.out.println("Obsah kruhu");
        System.out.println(Math.PI*(hodnoty.get(0)*hodnoty.get(0)));

    }
}
