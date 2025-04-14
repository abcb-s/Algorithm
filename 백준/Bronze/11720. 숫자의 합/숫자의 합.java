import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();       // 첫 줄에서 숫자의 개수 입력
        String numbers = scanner.next(); // 두 번째 줄에서 숫자 문자열 입력

        int sum = 0;
        for (int i = 0; i < N; i++) {
            // 문자열의 각 문자를 숫자로 변환해서 더함
            sum += numbers.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}