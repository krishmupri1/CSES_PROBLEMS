import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CoinPiles {

    public static void main(String args[]) throws IOException {
        FastInput fs = new FastInput();
        BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(System.out));
        long t = fs.nextLong();
        while (t-- > 0) {
           long a = fs.nextLong();
           long b = fs.nextLong();

         if(a>b){
             {
                 long temp=a;
                 a=b;
                 b=temp;
             }
         };
         if(2*a<b)System.out.println("NO");
         else{

             a%=3;
             b%=3;
             //System.out.println(a+" "+ b);
             if(a>b){
                 long temp=a;
                 a=b;
                 b=temp;
             }
            // System.out.println(a+" "+ b);
             if((a==1 && b==2) ||  (a==0 && b==0))System.out.println("YES");
             else{
                 System.out.println("NO");
             }
         }


        }
    }


//        static boolean recurse(long a,long b){
//           if(a==0 && b==0)return true;
//           if(a<0 || b<0)return false;
//          return recurse(a-1,b-2)||recurse(a-2,b-1);
//        }
    }

