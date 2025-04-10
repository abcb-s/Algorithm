import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N과 X 입력 받기
        int N = sc.nextInt();
        int X = sc.nextInt();

        // N개의 정수를 담을 배열
        int[] A = new int[N];

        // 수열 A 입력 받기
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // X보다 작은 수 출력
        for (int i = 0; i < N; i++) {
            if (A[i] < X) {
                System.out.print(A[i] + " ");
            }
        }

        sc.close(); // 리소스 정리
    }
}