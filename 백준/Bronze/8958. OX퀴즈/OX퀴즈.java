import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // 줄바꿈 제거

        for (int i = 0; i < T; i++) {
            String line = sc.nextLine();
            int sum = 0;
            int count = 0;

            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }

            System.out.println(sum);
        }
    }
}