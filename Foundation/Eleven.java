public class Eleven{
    //Function is a block of code which is used to perform specific task,there are two main types of funtion such as static and non static function ,where static function belongs directly to the class and we can call it directly but non static function require creation of an object in order to call it
    static int add(int a,int b){
        return a+b;
    }
    static void greet(){
        System.out.println("hello world !");
    }
    static void printName(String Name){
        System.out.println("My name is:"+Name);
    }
    static double luckyNumber(){
        return 5;
    }
    public static void main(String[] args){
        System.out.println(add(2,3));
        greet();
        printName("Rupesh Kumar Chaudhary");
        double result=luckyNumber();
        System.out.println(result);
    }
}