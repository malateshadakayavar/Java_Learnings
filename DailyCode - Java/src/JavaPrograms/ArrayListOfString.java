package JavaPrograms;

import java.util.ArrayList;

public class ArrayListOfString {
    public static void main(String[] args){

        ArrayList<String> states = new ArrayList<>();
        states.add("Karnataka");
        states.add("AP");
        states.add("UP");
        states.add("MH");
        states.add("MP");

        states.add(1,"KL");

        System.out.println(states.get(3));
        states.remove(1);

        System.out.println(states);
        System.out.println(states.size());

    }
}
