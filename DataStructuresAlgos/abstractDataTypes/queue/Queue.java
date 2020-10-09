package queue;

public class Queue<T> {
    private int maxSize;
    private T[] array;
    private int front;
    private int back;
    private int currentSize;

    /*
    Java does not allow generic type arrays. So we have used an
    array of Object type and type-casted it to the generic type V.
    This type-casting is unsafe and produces a warning.
    Comment out the line below and execute again to see the warning.
    */
    @SuppressWarnings("unchecked")
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        array = (T[]) new Object[maxSize]; //Casting
        front = 0;
        back = -1;
        currentSize = 0;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public T top() {
        return array[front];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public void enqueue(T value) {
        if (isFull())
            return;
        back = (back + 1) % maxSize; //to keep the index in range
        array[back] = value;
        currentSize++;
    }

    public T dequeue() {
        if (isEmpty())
            return null;

        T temp = array[front];
        front = (front + 1) % maxSize; //to keep the index in range
        currentSize--;

        return temp;
    }
}
