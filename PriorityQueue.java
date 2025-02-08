import java.util.ArrayList;

class DataInput {
    int priority;
    String s;

    public DataInput(int priority, String s) {
        this.priority = priority;
        this.s = s;
    }
}

public class PriorityQueue {
    public static void main(String[] args) {
        // List to store the input data with priority
        ArrayList<DataInput> list = new ArrayList<>();
        // List to store the elements after sorting by priority in descending order
        ArrayList<DataInput> poppedList = new ArrayList<>();

        // Adding elements with different priorities
        list.add(new DataInput(0, "Hello"));
        list.add(new DataInput(1, "World"));
        list.add(new DataInput(1, "Adform"));
        list.add(new DataInput(9, "Thakur"));

        // Sorting the elements by priority in descending order
        // Iterating from highest priority (9) to lowest priority (0)
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < list.size(); j++) {
                // If the current element has the current priority, add it to poppedList
                if (list.get(j).priority == i) {
                    poppedList.add(list.get(j));
                }
            }
        }

        for (DataInput dI : poppedList) {
            System.out.println(dI.priority + " " + dI.s);
        }
    }
}
