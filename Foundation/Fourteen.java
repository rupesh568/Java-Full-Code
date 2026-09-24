public class Fourteen{
    public static void main(String[] args){
        int i=1;
        while(i<=10){
            if(i==4){
                break;

            }
            System.out.println(i);
            i++;
        }

        int j=1;
        while(j<=20){
            if(j==5){
                j+=1;
                continue;
            }
            System.out.println(j);
            j++;
        }

        int k=1;
        while(k<=10){
            if(k==2){
                k+=2;
                continue;
            }
            System.out.println(k);
            k++;
        }
        //printing of a table;

        int n=2;
        int l=1;
        while(l<=10){
            System.out.println(n*l);
            l++;
        }
    }
}