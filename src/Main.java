import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Fighter p1=new Fighter("Rocky",95,100,10,40);
        Fighter p2=new Fighter("Apollo",95,100,11,40);
        Match play = new Match(p1,p2,90,100);
        play.run();
    }
}
