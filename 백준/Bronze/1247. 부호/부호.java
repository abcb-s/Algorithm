import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<3; i++){
            int N = sc.nextInt();
            BigInteger S = BigInteger.ZERO;
            for(int j = 0; j<N; j++){
                BigInteger M = sc.nextBigInteger();
                S = S.add(M);
            }
            if(S.compareTo(BigInteger.ZERO) > 0){
                System.out.println("+");
            } else if (S.compareTo(BigInteger.ZERO) < 0) {
                System.out.println("-");
            }else{
                System.out.println("0");
            }
        }
    }
}