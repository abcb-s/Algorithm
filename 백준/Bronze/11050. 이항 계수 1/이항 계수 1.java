import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long numerator = 1;   // n!
        long denom1 = 1;      // k!
        long denom2 = 1;      // (n-k)!

        for (int i = 1; i <= n; i++) numerator *= i;
        for (int i = 1; i <= k; i++) denom1 *= i;
        for (int i = 1; i <= n - k; i++) denom2 *= i;

        long result = numerator / (denom1 * denom2);
        System.out.println(result);
    }
}