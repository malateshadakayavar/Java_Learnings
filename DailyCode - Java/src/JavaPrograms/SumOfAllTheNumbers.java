package JavaPrograms;

public class SumOfAllTheNumbers {

    public static void sumTest(){
        int n = 100;
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){

        sumTest();

    }
}
