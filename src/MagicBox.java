import java.util.Random;

public class MagicBox<T> {
    private T[] items;
    private int size;

    public MagicBox(int size) {
        T[] items = (T[]) new Object[size];
        this.items = items;
        this.size = size;
    }

    boolean add(T item) {
        for (int i = 0; i < size; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        int empty = 0;
        for (T item : items) {
            if (item == null) {
                empty++;
            }
        }
        if (empty != 0) {
            throw new RuntimeException("Коробка не полна, осталось заполнить " + empty + " ячеек.");
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }

}
