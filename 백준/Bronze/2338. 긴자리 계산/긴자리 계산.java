import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger A = new BigInteger(sc.nextLine());
        BigInteger B = new BigInteger(sc.nextLine());

        System.out.println(A.add(B));      // 덧셈
        System.out.println(A.subtract(B)); // 뺄셈
        System.out.println(A.multiply(B)); // 곱셈
    }
}