import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            String[] words = new String[n];

            for (int i = 0; i < n; i++) {
                words[i] = sc.next(); // 단어 입력
            }

            // 가장 먼저 오는 단어 찾기
            String answer = words[0];
            for (int i = 1; i < n; i++) {
                // 사전순 비교 (대소문자 무시)
                if (words[i].compareToIgnoreCase(answer) < 0) {
                    answer = words[i];
                }
            }

            System.out.println(answer); // 원본 형태로 출력
        }
    }
}