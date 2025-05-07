import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(); // king
        int q = scanner.nextInt(); // queen
        int l = scanner.nextInt(); // rook
        int b = scanner.nextInt(); // bishop
        int n = scanner.nextInt(); // knight
        int p = scanner.nextInt(); // pawn

        System.out.print((1 - k) + " ");
        System.out.print((1 - q) + " ");
        System.out.print((2 - l) + " ");
        System.out.print((2 - b) + " ");
        System.out.print((2 - n) + " ");
        System.out.print((8 - p));
    }
}