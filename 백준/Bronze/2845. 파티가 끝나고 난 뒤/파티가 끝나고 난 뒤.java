import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int P = scanner.nextInt();
        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            System.out.print(n-(L*P)+" ");
        }
    }
}