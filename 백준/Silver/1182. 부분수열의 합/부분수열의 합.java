import java.util.*;

public class Main {
    static int n, s;
    static int[] arr;
    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        s = input.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        dfs(0, 0);

        // 공집합 제외
        if (s == 0) count--;

        System.out.println(count);
    }

    static void dfs(int idx, int sum) {
        if (idx == n) {
            if (sum == s) count++;
            return;
        }

        // 현재 원소 포함
        dfs(idx + 1, sum + arr[idx]);

        // 현재 원소 미포함
        dfs(idx + 1, sum);
    }
}