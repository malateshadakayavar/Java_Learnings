package JavaPrograms;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args){

        //HashSet, treeSet, LinkedHashset implements the set interface.
        // Does not accept duplicate values.
        // there is no guarantee that the elements are stored in sequential order --> Random order.

        HashSet<String> hs = new HashSet<String>();
        hs.add("USA");
        hs.add("India");
        hs.add("UK");
        hs.add("Canada");
        hs.add("Germany");

        System.out.println(hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());
        //System.out.println(hs.remove("UK"));
        System.out.println(hs);

        //Iterator

        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
