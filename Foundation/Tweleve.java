public class Tweleve{
    void hello(){
        System.out.println("hello world");
    }
    int square(int a){
        return a*a;
    }
    public static void main(String[] args){
        Tweleve s1=new Tweleve();
        s1.hello();
        int result=s1.square(4);
        System.out.println("square "+result);

 
    }
}