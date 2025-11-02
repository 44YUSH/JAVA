import java.util.*;

public class Q062_LL_CollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");
        list.addLast("list"); //  [OR]  list.add("list");
        System.out.println(list);
        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");

        // works as deleteFirst
        list.removeFirst();
        System.out.println(list);

         // works as deleteLast
        list.removeLast();
        System.out.println(list);

        // deleting specific index
        list.remove(1);
        System.out.println(list);
    }
}
