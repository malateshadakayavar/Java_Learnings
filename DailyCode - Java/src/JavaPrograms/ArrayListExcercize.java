package JavaPrograms;

import java.util.ArrayList;

public class ArrayListExcercize {
        public static void main(String[] args){

            ArrayList<String> a = new ArrayList<String>();
            a.add("apple");
            a.add("banana");
            a.add("cherry");
            a.add("mango");
            a.add("apple");

            //1
            System.out.println(a);

            //2
            a.remove(0);
            System.out.println(a);


            //3
            if(a.contains("orange")){

                System.out.println("orange found in the list");
            }
            else{
                System.out.println("Orange not found in the list");
            }

            //4
            System.out.println(a.size());

            //5
            System.out.println("Elements (index, value) : ");

            for(int i=0; i<a.size();i++)
            {
                System.out.println("- index : "+i+", Value : "+a.get(i));
            }



        }
    }

