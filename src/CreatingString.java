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

public class CreatingString {


    public static void main(String args[]) throws IOException {

        FstInput fs = new FstInput();
        BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(System.out));
        String s = fs.nextLine();
        //for counting distinct permutation
        //method 1
//        int [] arr=new int[9];
//            arr[0]=1;
//            arr[1]=1;
//            arr[2]=2;
//            arr[3]=6;
//            arr[4]=24;
//            arr[5]=120;
//            arr[6]=720;
//            arr[7]=5040;
//            arr[8]=40320;
//        HashMap<Character,Integer> hm=new HashMap<>();
//        for(int i=0;i<s.length();i++){
//            hm.put(s.charAt(i),1+hm.getOrDefault(s.charAt(i),0));
//        }
//        int count=0;
//        count+=arr[s.length()];
//        for(Map.Entry m:hm.entrySet()){
//            count/=arr[(int)m.getValue()];
//        }
//        System.out.println(count);
////approach 1
//        ArrayList<String> a=getPermutation(s);
//        for(String i:a){
//            System.out.println(i);
//        }
//    }
//
//
//   static  ArrayList<String> getPermutation(String s){
//       ArrayList<String>answer=new ArrayList<>();
//       //base case
//       if(s.length()==0){
//           answer.add("");
//           return answer;
//       }
//        char c=s.charAt(0);
//
//        //get the previous permutation
//        ArrayList<String>permutation=getPermutation(s.substring(1));
//
//        for(String i:permutation){
//            for(int j=0;j<=i.length();j++){
//               String sq=addAfterEveryIndex(i,c,j);
//               answer.add(sq);
//            }
//        }
//return answer;
//    }
//    static String addAfterEveryIndex(String word,char c,int j){
//        String left=word.substring(0,j);
//        String right=word.substring(j);
//        return left+c+right;
//    }
//}
        //method 2

//     ArrayList<String> ls=getPermutation(s);
//     System.out.println(ls.size());
//     for(String h:ls){
//         System.out.println(h);
//     }
//    }
//
//
//static ArrayList<String> getPermutation(String s){
//        ArrayList<String> answer=new ArrayList<>();
////base case
//if(s.length()==0){
//    answer.add("");
//    return answer;
//}
//
//for(int i=0;i<s.length();i++){
//
//    String left=s.substring(0,i);
//    String right=s.substring(i+1,s.length());
//    ArrayList<String> partial=getPermutation(left+right);
//
//
//    for(String q:partial){
//        answer.add(q+s.charAt(i));
//    }
//
//}
//
//return answer;
//
//    }
//
//}

//method 3
        //handling dulplicate case alse
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),1+hm.getOrDefault(s.charAt(i),0));
        }
     ArrayList<String> answer=new ArrayList<>();
     getPermutation(hm, "",answer,s);
     System.out.println(answer.size());
     for(String d:answer){
         System.out.println(d);
     }

    }

static void getPermutation(HashMap<Character,Integer>hm,String prefix,ArrayList<String> answer,String s){
        //base case
    if(s.length()==0){
        answer.add(prefix);
        return;
    }
for(Character cf:hm.keySet()){
    int count=hm.get(cf);
    if(count>0){
        hm.put(cf,count-1);
    getPermutation(hm,prefix+cf,answer,s.substring(0,s.length()-1));
hm.put(cf,count);
}}
//    for(int i=0;i<s.length();i++){
//
//        String left=s.substring(0,i);
//        String right=s.substring(i+1,s.length());
//
//        char c=s.charAt(i);
//        getPermutation(prefix+c,answer,left+right);

    }


}
/*
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






*/
