import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


import java.io.*;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;
        import java.util.StringTokenizer;

public class PalindromReorder {




    public static void main(String args[]) throws IOException {


        FastInput fs =new FastInput();
        BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(System.out));
        //long n=fs.nextLong();
String s=fs.nextLine();

int  arr[]=new int[26];

for(int i=0;i<s.length();i++){
    arr[s.charAt(i)-'A']++;
    //if(arr[s.charAt(i)-'A']==1){
      // ref=s.charAt(i);
   // }
}
//IF ALL THE CHARACTERS ARE NOT SAME
//int count_1=0,count_2=0;
//boolean flag=false;
//int index_of_1=0;
//for(int i=0;i<arr.length;i++){
//    if(arr[i]==1){
//        index_of_1=i;
//        count_1++;}
//    else if(arr[i]%2==0){
//        count_2+=arr[i];}
//    else{
//        flag=true;
//        break;
//    }
//}
        //IF ALL THE CHARACTERS SAME
        int odd=0;
        for(int i=0;i<arr.length;i++) {
            odd+=arr[i]%2;
        }
        if(odd>1)System.out.println("NO SOLUTION");
else{
    StringBuffer sb=new StringBuffer("");

        for (int i = 0; i <26; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = 0; j < arr[i] / 2; j++) {
                    sb.append((char) ('A' + i));
                }
            }
        }
        System.out.print(sb.toString());
            for (int i = 0; i <26; i++) {
                if (arr[i] % 2 != 0) {
                    for (int j = 0; j < arr[i]; j++) {
                        System.out.print((char) ('A' + i));
                    }
                }
            }
           sb=sb.reverse();
            System.out.print(sb.toString());



}
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



