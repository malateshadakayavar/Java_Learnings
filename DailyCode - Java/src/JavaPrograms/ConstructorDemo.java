package JavaPrograms;

public class ConstructorDemo {

    public  ConstructorDemo(){

        System.out.println("I am the constructor");
    }
    public ConstructorDemo(int a, int b){
        System.out.println("Parameterized constructor");
    }
    public ConstructorDemo(String str){
        System.out.println(str);
    }
    public void getData(){
        System.out.println("I'm the method");
    }
    //Will not return any value
    //Name of the constructor should be same as class

    public static void main(String[]args){

        ConstructorDemo cd = new ConstructorDemo();
        ConstructorDemo cd1 = new ConstructorDemo(3, 5);
        ConstructorDemo cd2 = new ConstructorDemo("Hello");
        //
        // Constructor will pick implicit constructor if you have not defined it
        //Whenever you create an object, constructor will be called.
    }
}
