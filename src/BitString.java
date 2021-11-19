import java.io.*;
import java.util.StringTokenizer;

public class BitString {

    public static void main(String [] args) throws IOException {
       FastInput fs =new FastInput();
        BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(System.out));


        long n=fs.nextInt();
        long mod=1000000007;
        long ans=power(2,n,mod);


        System.out.println(ans);
        //output.write(res);
//output.flush();





    }
    static long power(long x,long y,long p)
    {
        long res = 1; // Initialize result

        x = x % p; // Update x if it is more than or
        // equal to p

        if (x == 0)
            return 0; // In case x is divisible by p;

        while (y > 0)
        {

            // If y is odd, multiply x with result
            if ((y & 1) != 0) {
                res = (res * x) % p;
                //System.out.println(res);
            }
            // y must be even now
            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }
        return res;
    }
}
