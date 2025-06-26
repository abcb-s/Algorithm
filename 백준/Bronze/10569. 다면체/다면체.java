import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int V = sc.nextInt();
            int E = sc.nextInt();
            System.out.println((V-E-2)*(-1));
        }
    }
}