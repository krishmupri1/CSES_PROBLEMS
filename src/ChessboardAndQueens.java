import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
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
public class ChessboardAndQueens {
    public static void main(String args[]) throws IOException {
        int[] arr=new int[]{0,1,2,3,4,5,6,7};

        FstInput fs = new FstInput();
//        BufferedWriter output = new BufferedWriter(
//                new OutputStreamWriter(System.out));
char[][] board=new char[8][8];
int counts=0;
        for (int i = 0; i < 8; i++) {
            for(int j=0;j<8;j++)
            {
                board[i][j] = fs.next().charAt(0);
            }
        }
        do {
            //System.out.println(arr.toString());

            boolean valid = true;
            for (int i = 0; i < 8; i++) {
                if (board[i][arr[i]] != '.') {
                    valid = false;
                    break;
                }
            }

            boolean diagonalOccupied[] = new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};

            for (int i = 0; i < 8; i++) {
                if(diagonalOccupied[i+arr[i]]){
                    valid=false;
                }
                diagonalOccupied[i + arr[i]]= true;
            }

            for(int i=0;i<15;i++){
                diagonalOccupied[i]=false;
            }
            for (int i = 0; i < 8; i++) {
                if(diagonalOccupied[i+7-arr[i]]){
                    valid=false;
                }
                diagonalOccupied[i + 7-arr[i]]= true;
            }
            counts=(valid==true)?counts+1:counts;
        }
        while(nextPermutation(arr));
        //we need to cover 4 cases
      /*  1. no same row
         2.no same column
         3. no same diagonal
         4.no occupied place  */
        //checking all permutation and checking which one is valid
        //column number or row number
        // 1 2 3 4  5 6 7 8
        //checking for diagonals like 2 queens are not on same diagonals
        //basis of distinction comes from difference from y-x  a set of all elements comes in same diagonal if all have same y-x
        //to avoid negative  y-x we will do 7-y-x
        // value of 7+y-x   0 to 14    large diagonal
        //another case if we check from right to left diagonally we will find x+y is same vlaue will range from 2 to 16
        //small diagonals
        //summary for every permutation of 1 to 8  we need to find y cordinate and check if boolean array for diagonal and empty palce if it validate to place queen we we will add it to solution
        //this will store our answer
System.out.println(counts);
    }


    // Java program to implement
// the next_permutation method



        // Function to swap the data
        // present in the left and right indices
        public static int[] swap(int data[], int left, int right)
        {

            // Swap the data
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;

            // Return the updated array
            return data;
        }

        // Function to reverse the sub-array
        // starting from left to the right
        // both inclusive
        public static int[] reverse(int data[], int left, int right)
        {

            // Reverse the sub-array
            while (left < right) {
                int temp = data[left];
                data[left++] = data[right];
                data[right--] = temp;
            }

            // Return the updated array
            return data;
        }

        // Function to find the next permutation
        // of the given integer array
        public static boolean nextPermutation(int data[])
        {

            // If the given dataset is empty
            // or contains only one element
            // next_permutation is not possible
            if (data.length <= 1)
                return false;

            int last = data.length - 2;

            // find the longest non-increasing suffix
            // and find the pivot
            while (last >= 0) {
                if (data[last] < data[last + 1]) {
                    break;
                }
                last--;
            }

            // If there is no increasing pair
            // there is no higher order permutation
            if (last < 0)
                return false;

            int nextGreater = data.length - 1;

            // Find the rightmost successor to the pivot
            for (int i = data.length - 1; i > last; i--) {
                if (data[i] > data[last]) {
                    nextGreater = i;
                    break;
                }
            }

            // Swap the successor and the pivot
            data = swap(data, nextGreater, last);

            // Reverse the suffix
            data = reverse(data, last + 1, data.length - 1);

            // Return true as the next_permutation is done
            return true;
        }

        // Driver Code



    //next permutation java

//    public static     ArrayList<Integer> swap(ArrayList<Integer>  arr,int first,int second){
//
//        int temp=arr.get(first);
//        arr.add(first,arr.get(second));
//        arr.add(second,temp);
//return arr;
//    }
//
//
//
//    public static   ArrayList<Integer> reverse(    ArrayList<Integer>  arr,int first,int second){
//
//        //reverse a range of elements
//
//        int i=0;
//        int j=arr.size()-1;
//        while(i<j){
//          int temp= arr.get(i);
//          arr.add(i,arr.get(j));
//          arr.add(j,temp);
//          i++;
//          j--;
//        }
//return arr;
//    }
//
//
//
//
//    public static boolean nextPermutation(ArrayList<Integer> arr){
//        if(arr.size()<=1)return false;
//
//
//        int last=arr.size()-2;
//        while(last>=0){
//            if(arr.get(last)<arr.get(last+1)){
//                break;
//            }
//            last--;
//        }
//
//        if(last<0)return false;
//        int nextGreater=arr.size()-1;
//
//        for(int i=arr.size()-1;i>last;i--){
//            if(arr.get(i)>arr.get(last)){
//                nextGreater=i;
//                break;
//
//            }
//        }
//       arr=  swap(arr,nextGreater,last);
//     arr=   reverse(arr,last+1,arr.size()-1);
//
//
//        return true;
//
//    }


}
//
//            boolean visited[][]=new boolean[8][8];
//            Queue<Integer> q1=new LinkedList<>();//for storing x cordinate
//            Queue<Integer> q2=new LinkedList<>();//for storing y cordinate
//            int left[]=new int []{-1,1,0,0};
//            int right[]=new int[]{0,0,-1,1};
//            int source_x=0;
//            int source_y=0;
//            q1.add(source_x);
//            q2.add(source_y);
//            visited[source_x][source_y]=true;
//            while(q1.size()>0){
//
//                q1.poll();
//                q2.poll();
//
//              traverse(visited,source_x,source_y,left,right,input,q1,q2);
//
//            }
//        }
//        public static void traverse(boolean[][] visited,int source_x,int source_y,int[] left,int [] right,char[][] input,Queue<Integer>q1,Queue<Integer> q2){
//                    for(int i=0;i<4;i++){
//                        source_x+=left[i];
//                source_y+=right[i];
//
//                if(source_x<0 ||source_y<0)continue;
//                if(source_x>=8 || source_y>=8)continue;
//                if(input[source_x][source_y]!='.')continue;
//                if(visited[source_x][source_y])continue;
//                q1.add(source_x);
//                q2.add(source_y);
//                visited[source_x][source_y]=true;
//                System.out.println(q1.toString()+" "+q2.toString());
//            }
//        }
//}


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









