import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();
        int C = Integer.parseInt(sc.nextLine());

        int numA = Integer.parseInt(A);
        int numB = Integer.parseInt(B);
        System.out.println(numA + numB - C);
        System.out.println(Integer.parseInt(A+B) - C);




    }
}