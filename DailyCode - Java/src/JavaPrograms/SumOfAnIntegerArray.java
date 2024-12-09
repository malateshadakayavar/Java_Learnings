package JavaPrograms;

public class SumOfAnIntegerArray {

    public static void main(String[] args){
        int a[] = {1,2,3,5,6,-5,10};
        int sum=0;
        int i;

        for(i=0;i<a.length;i++){
            sum += a[i];
        }
        System.out.println(sum);
    }
}
