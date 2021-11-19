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
public class GrayCode {
    public static void main(String args[]) throws IOException {
        FastInput fs =new FastInput();
        BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(System.out));
            long n=fs.nextLong();
          // 0  1 2 3
            //0 1 2 3 4 5 6 7
        ArrayList<String> a=recursion(n);
        for(String s:a){
            System.out.println(s);
        }
        }
        public static ArrayList<String> recursion(long n){
        //base case
            if(n==1){
                ArrayList<String> res=new ArrayList<>();
                res.add("0");
                res.add("1");
                return res;
            }
        ArrayList<String> prevResult=recursion(n-1);
        ArrayList<String> myResult=new ArrayList<>();
        for(int i=0;i<prevResult.size();i++){
            myResult.add("0"+prevResult.get(i));
        }
        for(int i=prevResult.size()-1;i>=0;i--){
            myResult.add("1"+prevResult.get(i));
        }
        return myResult;

        }
    }


/*
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

*/




