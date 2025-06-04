import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n [] = new int[10];
        for (int i = 0; i < 10; i++) {
            n[i] = sc.nextInt();
            n[i] %= 42;
        }

        

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(n[i]);
        }

        System.out.println(set.size());
    }
}