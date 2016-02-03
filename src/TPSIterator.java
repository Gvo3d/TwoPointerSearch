import java.util.List;

/**
 * Created by Gvozd on 03.02.2016.
 */
public class TPSIterator {
    private List<Integer> data;
    private int pointer;

    public TPSIterator(List data, int pointer) {
        this.data = data;
        this.pointer = pointer;
    }

    public boolean hasNext() {
        if (data.get(pointer + 1) != null) return true;
        return false;
    }

    public void next() {
        pointer++;
    }

    public boolean hasPrevious() {
        if (data.get(pointer - 1) != null) return true;
        return false;
    }

    public void previous() {
        pointer--;
    }

    public int getNumber() {
        return data.get(pointer);
    }
}
