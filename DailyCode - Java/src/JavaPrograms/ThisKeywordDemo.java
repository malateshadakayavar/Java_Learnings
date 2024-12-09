package JavaPrograms;

public class ThisKeywordDemo {

    int a = 2;
    public void getData(){
        int a = 3;
        int b = this.a+a;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(b);
    }

    public static void main(String[] args){
         ThisKeywordDemo td = new ThisKeywordDemo();
         td.getData();
      // This always refers to the instance varialble in the class.

    }
}
