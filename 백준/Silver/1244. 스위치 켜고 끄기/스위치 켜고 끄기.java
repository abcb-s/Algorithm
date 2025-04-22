import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//스위치 갯수
        int[] switches = new int[N];
        for (int i = 0; i < N; i++) {
            switches[i] = sc.nextInt();
        }
        int P = sc.nextInt();//사람 수
        //사람 수 만큼 반복문 실행
        for (int i = 0; i < P; i++) {
            int G = sc.nextInt();//성별
            //남학생
            if (G == 1) {
                int S = sc.nextInt();
                //스위치 상태 변경
                for (int j = S - 1; j < N; j += S) {
                    switches[j] = switches[j] == 0 ? 1 : 0;
                }
            //여학생
            } else if (G == 2) {
                int S = sc.nextInt() - 1;
                int left = S, right = S;
                //스위치 상태 변경
                while (left >= 0 && right < N && switches[left] == switches[right]) {
                    switches[left] = switches[left] == 0 ? 1 : 0;
                    if (left != right) { // 가운데 하나일 경우 중복 방지
                        switches[right] = switches[right] == 0 ? 1 : 0;
                    }
                    left--;
                    right++;
                }
            }
        }
        for (int i = 0; i < switches.length; i++) {
            System.out.print(switches[i] + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }

    }
}