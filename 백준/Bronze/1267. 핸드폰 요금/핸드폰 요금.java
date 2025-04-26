import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 통화 횟수
        int[] calls = new int[n];

        for (int i = 0; i < n; i++) {
            calls[i] = sc.nextInt();
        }

        int yCost = 0; // 영식 요금제 총 금액
        int mCost = 0; // 민식 요금제 총 금액

        for (int time : calls) {
            yCost += (time / 30 + 1) * 10;
            mCost += (time / 60 + 1) * 15;
        }

        if (yCost < mCost) {
            System.out.println("Y " + yCost);
        } else if (yCost > mCost) {
            System.out.println("M " + mCost);
        } else { // 요금이 같은 경우
            System.out.println("Y M " + yCost);
        }
    }
}