import java.util.Comparator;
import java.util.List;

/**
 * Created by Gvozd on 03.02.2016.
 */
public class TwoPointerSearch {
    private static TwoPointerSearch instance;
    private Comparator comparator;

    private TwoPointerSearch() {
        this.comparator = new IntComp();
    }

    public static TwoPointerSearch getInstance() {
        if (instance == null)
            instance = new TwoPointerSearch();
        return instance;
    }

    public boolean hasValue(List data, int comparableValue) {
        TPSIterator iterStraight = new TPSIterator(data, 0);
        TPSIterator iterReverse = new TPSIterator(data, data.size() - 1);
        int maxStep = data.size() - 1;
        int step = 0;
        int sumNumber = 0;
        int comparationResult;

        while (step < maxStep) {
            if (!iterStraight.hasNext() || !iterReverse.hasPrevious()) break;
            try {
                sumNumber = iterStraight.getNumber() + iterReverse.getNumber();
            } catch (ClassCastException e) {
                throw new ClassCastException("Data list has not integer objects!");
            }
            comparationResult = dataComparation(sumNumber, comparableValue);
            if (comparationResult < 0) {
                iterReverse.previous();
            } else if (comparationResult == 0) {
                return true;
            } else {
                iterStraight.next();
            }
            step++;
        }
        return false;
    }

    private int dataComparation(int a, int b) {
        return comparator.compare(a, b);
    }
}
