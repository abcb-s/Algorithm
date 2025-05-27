import java.util.Scanner;

public class Main {
    static char[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String row = sc.next();
            for (int j = 0; j < M; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        int result = Integer.MAX_VALUE;

        // 모든 8x8 영역 검사
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                result = Math.min(result, countToChange(i, j));
            }
        }

        System.out.println(result);
    }

    // i,j 위치부터 시작하는 8x8 보드를 다시 칠해야 하는 칸 수 반환
    static int countToChange(int x, int y) {
        int count1 = 0; // 시작이 'W'
        int count2 = 0; // 시작이 'B'

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                // 기준 색상 계산
                if ((i + j) % 2 == 0) {
                    if (board[i][j] != 'W') count1++;
                    if (board[i][j] != 'B') count2++;
                } else {
                    if (board[i][j] != 'B') count1++;
                    if (board[i][j] != 'W') count2++;
                }
            }
        }

        return Math.min(count1, count2);
    }
}