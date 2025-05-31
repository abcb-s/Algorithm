import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt();//테스트케이스

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();//층수
            int W = sc.nextInt();//방 갯수
            int N = sc.nextInt();//몇번째 손님

            int floor = (N % H == 0) ? H : N % H;        // 층 수 계산
            int room = (N % H == 0) ? N / H : N / H + 1; // 호수 계산

            System.out.printf("%d%02d\n", floor, room);  
        }

    }
}