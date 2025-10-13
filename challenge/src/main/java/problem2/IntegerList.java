package problem2;

public class IntegerList {
    private int[] list;       // values in the list
    private int numElements;  // number of actual elements in the list

    //-------------------------------------------------------
    // create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size) {
        list = new int[size];
        numElements = 0;
    }

    //-------------------------------------------------------
    // fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize() {
        numElements = list.length; // fill all slots
        for (int i = 0; i < list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }

    //-------------------------------------------------------
    // print array elements with indices
    //-------------------------------------------------------
    public void print() {
        if (numElements == 0) {
            System.out.println("List is empty.");
            return;
        }
        for (int i = 0; i < numElements; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    //-------------------------------------------------------
    // double the size of the array when full
    //-------------------------------------------------------
    private void increaseSize() {
        int newSize = list.length * 2;
        int[] newList = new int[newSize];
        for (int i = 0; i < numElements; i++) {
            newList[i] = list[i];
        }
        list = newList;
    }

    //-------------------------------------------------------
    // add a new element to the list
    //-------------------------------------------------------
    public void addElement(int newVal) {
        if (numElements == list.length) {
            increaseSize();
        }
        list[numElements] = newVal;
        numElements++;
    }

    //-------------------------------------------------------
    // remove the first occurrence of newVal
    //-------------------------------------------------------
    public void removeFirst(int newVal) {
        for (int i = 0; i < numElements; i++) {
            if (list[i] == newVal) {
                // shift elements to the left
                for (int j = i; j < numElements - 1; j++) {
                    list[j] = list[j + 1];
                }
                numElements--;
                return;
            }
        }
    }

    //-------------------------------------------------------
    // remove all occurrences of newVal
    //-------------------------------------------------------
    public void removeAll(int newVal) {
        int newIndex = 0;
        for (int i = 0; i < numElements; i++) {
            if (list[i] != newVal) {
                list[newIndex] = list[i];
                newIndex++;
            }
        }
        numElements = newIndex;
    }
}
