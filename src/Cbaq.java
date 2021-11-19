import java.io.IOException;

class Helper{
    private int n;
    int count;
    Helper(int n){
        this.n=n;
        count=0;
    }
    //col=0;
    int res(char[][] boardss){
        help(0,boardss);
        return this.count;
    }

   // Helper hel=new Helper(8);
void help(int column,char[][] board) {
    for (int i = 0; i < n; i++) {
        if (valid_position(i, column, board) && board[i][column] == '.') {
            board[i][column] = '$';
            help(column + 1, board);
            board[i][column] = '.';
            if (column == n - 1) count++;
        }
    }
}

boolean valid_position(int x,int y,char [][] board) {
    for (int i = 0; i < y; i++) { //Columns before that
        if (board[x][i]=='$')
            return false;

    }
    for (int a=x,b=y; a<n && b>=0 ;a++,b--) { //Diagonal top
        if (board[a][b]=='$')
            return false;
    }
    for (int i = Integer.min(x,y)-1; i >= 0; i--) { //Diagonal below
        if (board[--x][--y]=='$'){
            return false;
        }
    }

    return true;
}




}


public class Cbaq {

    public static void main(String args[]) throws IOException {
        FstInput f = new FstInput();
        Helper h = new Helper(8);

        char[][] board=new char[8][8];
        for (int i = 0; i < 8; i++) {
            String str = f.nextLine();
            for (int j = 0; j < 8; j++) {
board[i][j]=str.charAt(j);
            }
        }
        System.out.println(h.res(board));



    }
}

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









