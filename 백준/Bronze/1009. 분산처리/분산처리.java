import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 각 숫자의 반복 패턴 길이는 최대 4
            int[] pattern = new int[4];
            int base = a % 10;

            if (base == 0) {
                System.out.println(10); // 0번 컴퓨터는 10번 컴퓨터
                continue;
            }

            pattern[0] = base;
            for (int j = 1; j < 4; j++) {
                pattern[j] = (pattern[j - 1] * base) % 10;
            }

            int idx = (b - 1) % 4;
            System.out.println(pattern[idx]);
        }
    }
}