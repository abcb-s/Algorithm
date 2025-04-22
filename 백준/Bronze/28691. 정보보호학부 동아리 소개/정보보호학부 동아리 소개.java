import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String D = sc.nextLine();

        if(D.equals("M") || D.equals("m")) {
            System.out.println("MatKor");
        } else if(D.equals("W") || D.equals("w")) {
            System.out.println("WiCys");
        } else if(D.equals("C") || D.equals("c")) {
            System.out.println("CyKor");
        } else if(D.equals("A") || D.equals("a")) {
            System.out.println("AlKor");
        } else if(D.equals("$")) {
            System.out.println("$clear");
        }
    }
}