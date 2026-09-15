public class Five{
    public static void main(String[] args){
        //Type casting :implicit and explicit;
        int a=2;
        float b=a;
        System.out.println(b); //this is implicit because it automatically got converted to float;
        int c=257;
        byte d=(byte)c;
        System.out.println(d); //this is explict  as it is manually converted;

        long l=32333423L;
        int k=(int) l;
        System.out.println(k); 


    }
}