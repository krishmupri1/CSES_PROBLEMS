import java.io.*;
import java.util.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
public class ApleDivision {
    public static void main(String args[]) throws IOException {
        FstInput fs = new FstInput();
        BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(System.out));
        long n = fs.nextLong();
        long arr[] = new long[(int) n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = fs.nextLong();
            sum += arr[i];
        }

        int total=1<<n;
        long min=Integer.MAX_VALUE;
        for(int i=0;i<total;i++){

            long sum1=0;
            long sum2=0;
            for(int j=0;j<n;j++){
                if((i & 1<<j)!=0){
                    sum1+=arr[j];
                }
                else{
                    sum2+=arr[j];
                }

            }
            min=Math.min(min,Math.abs(sum1-sum2));

        }

      System.out.println(min);


    }}


//    class FstInput {
//        BufferedReader br;
//        StringTokenizer st;
/*
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
    }*/








