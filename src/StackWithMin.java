import java.util.Arrays;
import java.util.Stack;

public class StackWithMin<E> {
    int capacity;
    Object [] objectData;
    Object [] min;
    int increment;
    int top = 0;
    public StackWithMin() {
        this(10);
    }

    public StackWithMin(int capacity) {
        this(capacity,10);
    }

    public StackWithMin(int capacity, int increment) {
        this.capacity = capacity;
        this.increment = increment;
        objectData = new Object[capacity];
    }

    E push(E obj) {
        addElement(obj);
        return obj;
    }

    void addElement(E obj) {
        top++;
        inssureCapacaty(top);
    }

    void inssureCapacaty(int count) {
        if (top >= capacity){
            grow(increment);
        }
    }

    void grow(int step) {
        int oldCapacity = objectData.length;
        int newCapacity = oldCapacity + step;
        objectData = Arrays.copyOf(objectData, newCapacity);
    }


}
