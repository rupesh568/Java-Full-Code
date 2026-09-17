public class Six{
    public static void main(String[] args){
        //operators;
        //assignment operators:+,-,*,/,%;
        int a=2;
        int b=3;
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));

        //pre increment and decrement;
        int c=4;
        int d=++c;
        System.out.println("d="+d); //5
        int e=--d;
        System.out.println("e="+e); // 4


        //post increment;

        int f=6;
        System.out.println("f="+(f++));
        System.out.println(f);

        int g=8;
        System.out.println("g="+(g--));
        System.out.println(g);

        //relational operator;

        int x=2;
        int y=4;
        System.out.println("x>y="+(x>y));
        System.out.println("x<y="+(x<y));
        System.out.println("x==y="+(x==y));
        System.out.println("x!=y="+(x!=y));
        System.out.println("x>=y="+(x>=y));
        System.out.println("x<=y="+(x<=y));

        //assignment operators;

        int r=8;
        int s=9;
        System.out.println("r="+(r+=2));
        System.out.println("s="+(s-=1));
        System.out.println("s="+(s*=3));
        System.out.println("r="+(r/=2));

    }
}