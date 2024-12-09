package JavaPrograms;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args){

        ArrayList<String> ar = new ArrayList<String>();
        ar.add("Rahul");
        ar.add("Malatesh");
        ar.add("Rohan");
        ar.add(0,"John");
        //ar.remove(2);
        System.out.println(ar.get(2));
        System.out.println(ar);

        System.out.println(ar.contains("Malatesh"));
        System.out.println(ar.indexOf("Rohan"));
        System.out.println(ar.isEmpty());
        System.out.println(ar.size());

        //Note :
        //ArrayList, LinkedList, Vector --> Implementing list interface.
        //Array has fixed size, whereas ArrayList can grow dynamically.
        //You can access & insert any value in any index.

    }
}
