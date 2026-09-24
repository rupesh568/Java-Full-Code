import java.util.Scanner;
//taking input in java using scanner in which scanner is a class which we have to import by using its library than sc is the object and system.in means we take input from the keyboard;
public class Ten{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of a:");
        int a=sc.nextInt();
        System.out.print("enter the value of b:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum="+sum);
        System.out.print("enter the value of c:");
        byte c=sc.nextByte();
        System.out.print("enter the value of d:");
        byte d=sc.nextByte();
        int diff=c-d;
        System.out.println("difference="+diff);
        System.out.print("enter the value of e:");
        short e=sc.nextShort();
        System.out.print("enter the value of f:");
        short f=sc.nextShort();
        int product=e*f;
        System.out.println("product="+product);
        System.out.print("enter the value of g:");
        float g=sc.nextFloat();
        System.out.print("enter the value of h:");
        float h=sc.nextFloat();
        float div=g/h;
        System.out.println("div="+div);
        System.out.print("enter a sigle character:");
        char ch=sc.next().charAt(0);
        System.out.println("char="+ch);
        System.out.print("enter the string:");
        String str=sc.next();
        System.out.println("str="+str);
        sc.nextLine();
        System.out.print("enter the entire sentence:");
        String paragraph=sc.nextLine();
        System.out.println("paragraph="+paragraph);




    }
}