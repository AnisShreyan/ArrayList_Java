import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //Add Elements
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //Get Element
        System.out.println(list.get(0));

        //Add Element at an Index
        list.add(1, 4);
        System.out.println(list);

        //Set Element at an Index
        list.set(0, 5);
        System.out.println(list);

        //Delete Element
        list.remove(0);
        System.out.println(list);

        //Array list size
        int size = list.size();
        System.out.println(size);

        //Loops
//        for (int i: list){
//            System.out.println(i);
//        }

        //Collection sort
        Collections.sort(list);
        System.out.println(list);
    }
}