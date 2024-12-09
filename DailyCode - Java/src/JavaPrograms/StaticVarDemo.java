package JavaPrograms;

public class StaticVarDemo {
    String name;
    String Address;
    static String City = "Bangalore";
    static int i=0;

    //Static block :
    static {
        City="Bangalore";
        i=0;
    }

    StaticVarDemo(String name, String Street) {
        this.name=name;
        this.Address=Street;
        i++;
        System.out.println(i);

    }
    public void getAddress(){
        System.out.println(Address+ " "+City);
    }

    public static void getCity(){
        System.out.println(City);
    }
    //Static methods allows only static variables

    public static void main(String[] args){
        StaticVarDemo st = new StaticVarDemo("Rahul", "Vijayanagar");
        StaticVarDemo st1 = new StaticVarDemo("Malatesh", "Jayanagar");
        StaticVarDemo st2 = new StaticVarDemo("Malatesh", "Jayanagar");

        st.getAddress();
        st1.getAddress();
        st2.getAddress();
        StaticVarDemo.getCity();
        StaticVarDemo.i=3;
    }
}
