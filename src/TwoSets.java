import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class TwoSets {

    public static void main(String args[]) throws IOException {


        FastInput fs =new FastInput();
        BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(System.out));
        long n=fs.nextLong();

        long sum=n;
        sum*=n+1;
        sum/=2;
        if(sum%2!=0)output.write("NO"+"\n");
        else{
            long half_sum=sum/2;
            //7        1 2 3 4 5 6 7  //half_sum=14
        ArrayList<Long> arr1=new ArrayList<>();
            ArrayList<Long> arr2=new ArrayList<>();
            long curr=0;
            for(long i=n;i>0;i--){
                if(curr+i<=half_sum){
                    arr1.add(i);
                    curr+=i;
                }
                else{
                    arr2.add(i);

                }
            }
            Collections.sort(arr1);
            Collections.sort(arr2);


            output.write("YES"+"\n");
            output.write(arr1.size()+"\n");
            for(int i=0;i<arr1.size();i++)output.write(arr1.get(i)+" ");
            output.write("\n");

            output.write(arr2.size()+"\n");
            for(int i=0;i<arr2.size();i++)output.write(arr2.get(i)+" ");

output.flush();












        }


    }
}


class FastInput {
    BufferedReader br;
    StringTokenizer st;

    public FastInput() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
            }
        }

        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (Exception e) {

        }
        return str;
    }
}




