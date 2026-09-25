import java.util.Scanner;
public class Sixteen{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr={{1,2,3},{4,5,6}};
        System.out.println(arr[0][0]);

        //taking input of 2D array;
        System.out.print("enter the number of rows:");
        int m=sc.nextInt();
        System.out.print("enter the number of column:");
        int n=sc.nextInt();
        int[][] arr1=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("printing all the values of matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(arr1[i][j]);
            }
        }
    }
}