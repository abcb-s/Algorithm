import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            arr[i] = a;
        }
        int lastIdx = arr.length - 1;
        Arrays.sort(arr);
        System.out.println(arr[0] * arr[lastIdx]);
    }
}