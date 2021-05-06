import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist_java {
    public static void main(String[] args){
        LinkedList<Integer> arr1 = new LinkedList<>();
        LinkedList<Integer> arr2 = new LinkedList<>();
//        arr1.add(1);
//        arr1.add(2);
//        arr1.add(4);
//        arr1.add(6);
//        arr1.add(4);
//        arr1.add(4,9);
//        arr1.add(0,8);
//        arr1.addFirst(222);
//        arr1.addLast(333);
//        arr1.set(1,342);

//        arr1.removeLast();
//        arr1.removeLastOccurrence(9);
        arr1.push(1);
        arr1.push(3);
        arr1.push(5);
        arr1.push(5);
        arr1.push(5);

        arr1.pop();
//        arr1.removeFirstOccurrence(1);

//        arr2.add(12);
//        arr2.add(14);
//        arr2.add(13);
//        arr2.add(18);
//        arr1.addAll(arr2);
//        arr1.addAll(3,arr2);
//        arr1.clear();
        for (Integer integer : arr1) {
            System.out.print(integer+" ");
        }
//        System.out.println(arr1.contains(4));
//        ArrayList<Integer> arr3 = (ArrayList<Integer>) arr1.clone();
        LinkedList arr3 = (LinkedList) arr1.clone();
//        System.out.println(arr1.poll());
        System.out.println(arr1.peek());
        Iterator i = arr1.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

//        System.out.println(arr3);
//        System.out.println(arr1.isEmpty());
//        System.out.println(arr1.indexOf(4));
//        System.out.println(arr1.lastIndexOf(4));
//        for (Integer integer : arr2) {
//            System.out.println(integer);
//        }



    }
}
