package JavaPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args){

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(0, "Hello");
        hm.put(1, "Goodbye");
        hm.put(2, "Morning");
        hm.put(3, "Evening");

        System.out.println(hm);
        System.out.println(hm.remove(2));
        System.out.println(hm.get(2));

        Set sn = hm.entrySet();
        Iterator<String> it = sn.iterator();

        while(it.hasNext())
        {
            Map.Entry mp=(Map.Entry)it.next();
            mp.getKey();
            mp.getValue();
        }
    }
}
