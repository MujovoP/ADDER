// Surname: MUJOVO
// Name: PAULOS
// Student no: 4125570
// Course: CSC211
// Year: 2023
// Assignment: Practical 2 Term 2
// File: PriorityQueue.java


import java.util.Date;

public class PriorityQueue {

    private int currentSize;
    private FlightNode[] array;
    private int DEFAULT_CAPACITY = 2<<10;

    public PriorityQueue() {
        this.currentSize = 0;
        this.array = new FlightNode[DEFAULT_CAPACITY];
    }

    public PriorityQueue(int capacity) {
        this.currentSize = 0;
        this.array = new FlightNode[capacity];
    }


    public int getCurrentSize() {
        return currentSize;
    }

    public FlightNode[] getArray() {
        return array;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public void setArray(FlightNode[] array) {
        this.array = array;
    }

    public void clear() {
        this.currentSize = 0;
        this.array = new FlightNode[DEFAULT_CAPACITY];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean add(FlightNode x) {
        if (currentSize == array.length - 1) {
            FlightNode[] newArray = new FlightNode[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        int hole = ++currentSize;
        array[hole] = x;

        for (; hole > 1 && x.getArrivalDate().compareTo(array[hole / 2].getArrivalDate()) < 0; hole /= 2) {
            array[hole] = array[hole / 2];
        }
        array[hole] = x;
        return true;
    }

    public FlightNode remove() {
        if (isEmpty()) {
            return null;
        }
        FlightNode root = array[1];
        array[1] = array[currentSize--];
        percolateDown(1);
        return root;
    }

    private void percolateDown(int hole) {
        int child;
        FlightNode temp = array[hole];
        for (; hole * 2 <= currentSize; hole = child) {
            child = hole * 2;
            if (child != currentSize && array[child + 1].getArrivalDate().compareTo(array[child].getArrivalDate()) < 0) {
                child++;
            }
            if (array[child].getArrivalDate().compareTo(temp.getArrivalDate()) < 0) {
                array[hole] = array[child];
            } else {
                break;
            }
        }
        array[hole] = temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= currentSize; i++) {
            sb.append(array[i]).append("\n");
        }
        return sb.toString();
    }
}
