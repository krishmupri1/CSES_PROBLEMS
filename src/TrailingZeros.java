import java.math.BigInteger;

public class TrailingZeros {
    public static void main(String[] args){

        FastInput fs=new FastInput();
        int n=fs.nextInt();
        int count=0;
        for(int i=5;n/i>=1;i*=5){
            count+=Math.floor(n/i);
        }
        System.out.println(count);

//        BigInteger factorial = BigInteger.ONE;
//        for (int i = n; i > 0; i--) {
//            factorial = factorial.multiply(BigInteger.valueOf(i));
//        }
//
//
//            String s=String.valueOf(factorial);
//        long count=0;
//        int i=s.length()-1;
//        while(s.charAt(i)=='0'){
//            count++;
//            i--;
//        }
//        System.out.println(count);

    }
}
