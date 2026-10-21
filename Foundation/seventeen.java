import java.util.Scanner;
public class seventeen{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] [] arr={{1,2,3,4},{5,6,7,8}};
        System.out.println(arr[0][0]);
        System.out.print("enter the number of rows:");
        int m=sc.nextInt();
        System.out.print("enter the number of columns:");
        int n=sc.nextInt();
        int [][] arr1=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
             arr1[i][j]=sc.nextInt();
            }
        }
        //printing the values of array;

        System.out.println("printing the values of array........");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(arr1[i][j]);
            }
        }
        
    }
}