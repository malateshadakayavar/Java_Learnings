package JavaPrograms;

public class ChildDemo extends ParentDemo{
    String name = "QAClickAcademy";

    public ChildDemo(){
        super();
        System.out.println("Child class constructor");
    }
    public void getStringData(){
        System.out.println(name);
        System.out.println(super.name);
    }

    public void getData(){
        super.getData();
        System.out.println("I'm the child class");
    }


    public static void main(String[] args){
        ChildDemo cd = new ChildDemo();

        cd.getStringData();
        cd.getData();
    }
}
