import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt(); // 출발점
            int y1 = sc.nextInt();
            int x2 = sc.nextInt(); // 도착점
            int y2 = sc.nextInt();

            int n = sc.nextInt(); // 행성계 개수
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                int cx = sc.nextInt(); // 행성 중심
                int cy = sc.nextInt();
                int r = sc.nextInt();  // 반지름

                boolean startInside = isInside(x1, y1, cx, cy, r);
                boolean endInside = isInside(x2, y2, cx, cy, r);

                if (startInside ^ endInside) cnt++; // 둘 중 하나만 안에 있으면 +1
            }

            System.out.println(cnt);
        }
    }

    // 좌표 (x, y)가 중심 (cx, cy) 반지름 r 안에 있는지 확인
    static boolean isInside(int x, int y, int cx, int cy, int r) {
        int dx = x - cx;
        int dy = y - cy;
        return dx * dx + dy * dy < r * r;
    }
}