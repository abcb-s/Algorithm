import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        int[] used = new int[101]; 
        for (int i = 0; i < n; i++) {
            int p = scanner.nextInt();
            if (used[p] == 1) {
                cnt++;
            } else {
                used[p] = 1;
            }
        }
        System.out.println(cnt);
    }
}