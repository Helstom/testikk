import java.util.Scanner;
import java.util.ArrayList;
public class Ctverec extends Obrazce{
    Scanner user = new Scanner(System.in);
    ArrayList<Integer> hodnoty = new ArrayList<>();
    public Ctverec(int stranaA) {
        super(stranaA);
    }
    @Override public void dataCollect(){
        //zepta se usera o zadani informaci o obrazci
        System.out.println("napis stranu A ctverece ");
        int stranaA = user.nextInt();
        hodnoty.add(stranaA);
    }
    @Override public void obvod(){
        System.out.println("Obvod");
        System.out.println(hodnoty.get(0)*4);
    }
    @Override public void obsah(){
        System.out.println("Obsah");
        System.out.println(hodnoty.get(0)*hodnoty.get(0));
    }
}
