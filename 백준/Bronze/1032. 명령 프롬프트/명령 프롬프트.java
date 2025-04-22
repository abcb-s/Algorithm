import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        String[] files = new String[N];
        for (int i = 0; i < N; i++) {
            files[i] = sc.nextLine();
        }

        int length = files[0].length();
        StringBuilder pattern = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char current = files[0].charAt(i);
            boolean allSame = true;

            for (int j = 1; j < N; j++) {
                if (files[j].charAt(i) != current) {
                    allSame = false;
                    break;
                }
            }

            if (allSame) {
                pattern.append(current);
            } else {
                pattern.append('?');
            }
        }

        System.out.println(pattern.toString());
    }
}