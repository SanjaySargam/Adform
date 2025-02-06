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
        ArrayList<DataInput> list = new ArrayList<>();
        ArrayList<DataInput> poppedList = new ArrayList<>();

        list.add(new DataInput(0, "Hello"));
        list.add(new DataInput(1, "World"));
        list.add(new DataInput(1, "Adform"));
        list.add(new DataInput(9, "Thakur"));

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < list.size(); j++) {
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
