import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            Integer[] A = new Integer[10]; // A는 각 테스트케이스마다 새로 생성해야 함
            for(int j = 0; j < A.length; j++) {
                A[j] = sc.nextInt(); // 배열 채우기
            }
            Arrays.sort(A, Collections.reverseOrder()); // 배열 다 채운 후 정렬
            System.out.println(A[2]); // 3번째 큰 값 출력
        }



    }
}