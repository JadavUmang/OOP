import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String []args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        System.out.println(list);

        // Traversing list through Iterator.
        Iterator itr = list.iterator();             //Getting the Iterator
        while (itr.hasNext()){                      //Check the list has next element or not
            System.out.println(itr.next());         //printing the element and move to next.
        }

        //Traversing list using for each loop
        for(String fruit:list){
            System.out.println(fruit);
        }

        // Using Get And Set ArrayList Methods
        System.out.println("Second Element is "+list.get(1));
        list.set(1,"WaterMellon");

        Collections.sort(list);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);


        Collections.sort(list2);
        System.out.println(list2);
        for (int n:list2){
            System.out.println(n);
        }
    }
}
