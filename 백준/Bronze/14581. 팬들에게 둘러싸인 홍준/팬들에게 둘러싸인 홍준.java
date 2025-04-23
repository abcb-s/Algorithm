import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f = ":fan:";//팬네임
        String h = sc.nextLine();//홍준아이디
        for (int i = 0; i < 3; i++) {
            System.out.print(f);
        }
        System.out.println();
        System.out.println(f + ':'+h+':' + f);
        for (int i = 0; i < 3; i++) {
            System.out.print(f);
        }
    }
}