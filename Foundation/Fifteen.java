//Array:Array is the collection of element of same data types stored  in a continous memory allocation;
import java.util.scanner;
public class Fifteen{
    public static void main(String[] args){
        scanner sc=new scanner();
        int[] arr={1,2,3,4};
        System.out.println(arr[0]);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int[] arr1=new int[6];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
    }
}