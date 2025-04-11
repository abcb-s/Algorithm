import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine()); // 개행 제거
        for (int i = 0; i < N; i++) {
            String S = scanner.nextLine();
            if (S.length() > 0) {
                System.out.println("" + S.charAt(0) + S.charAt(S.length() - 1));
            }
        }
    }
}