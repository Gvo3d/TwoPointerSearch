import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Gvozd on 03.02.2016.
 */
public class App {
    static List data = new ArrayList();
    private static final int SEARCHABLEINT = 50;


    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            data.add(rand.nextInt(50));
        }
        data.sort(new IntComp());

        System.out.println("Random data list:");
        for (Object integ : data) {
            System.out.println((int) integ);
        }
        System.out.println();

        TwoPointerSearch tps = TwoPointerSearch.getInstance();
        System.out.println("Searchable int: " + SEARCHABLEINT + ", result is " + tps.hasValue(data, SEARCHABLEINT));
    }
}
