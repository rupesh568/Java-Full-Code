public class Thirteen{
    public static void main(String[] args){
        System.out.println("For Loop:");
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("This is while loop....");
        int i=1;
        while(i<=10){
            System.out.println("i="+i);
            i+=1;
        }
        int j=1;
        do{
            System.out.println(j);
            j++;
        }while(j>2);
    }
}