import java.util.Comparator;

/**
 * Created by Gvozd on 03.02.2016.
 */
public class IntComp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) return 1;
        if (o1 < o2) return -1;
        return 0;
    }
}
