import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        String original = (n < 10) ? "0" + n : String.valueOf(n);
        String cycle = original;

        do {
            // 각 자리 수 더하기
            int sum = (cycle.charAt(0) - '0') + (cycle.charAt(1) - '0');
            // cycle 갱신: 이전 cycle의 마지막 자리 + sum의 마지막 자리
            cycle = "" + cycle.charAt(1) + (sum % 10);
            cnt++;
        } while (!cycle.equals(original));

        System.out.println(cnt);
    }
}