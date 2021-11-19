import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


import java.io.*;
        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.StringTokenizer;
        import java.io.*;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;
        import java.util.StringTokenizer;
        import java.io.BufferedWriter;
        import java.io.IOException;
        import java.io.OutputStreamWriter;
public class TowerOfHanoi {

    static int count=0;
    static ArrayList<Integer> arr=new ArrayList<>();
    public static void main(String args[]) throws IOException {
        FstInput fs = new FstInput();
        BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(System.out));
        long n = fs.nextLong();
        recursion( n,1,2,3);
        System.out.println(count);
        int i=0;
        while(i<2*count-1){
            System.out.println(arr.get(i)+" "+arr.get(i+1));
            i+=2;
        }
    }

    public static void recursion(long n,int  left,int  middle,int right){

        //base case

        if(n==1){
//            System.out.println(left+" "+right);
            arr.add(left);
            arr.add(right);
            count++;

            return;
        }

       recursion(n-1,left,right,middle);
        count++;
     arr.add(left);
     arr.add(right);
        recursion(n-1,middle,left,right);

        return;
    }
}


class FstInput {
    BufferedReader br;
    StringTokenizer st;

    public FstInput() {
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






