import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // 1부터 N까지 카드 큐에 넣기
        Queue<Integer> cardQueue = new LinkedList<>();
        
        for (int i = 1; i <= N; i++) {
            cardQueue.add(i);
        }
        
        // 버린 카드들 출력
        StringBuilder sb = new StringBuilder();
        
        // 카드가 하나 남을 때까지 반복
        while (cardQueue.size() > 1) {
            // 첫 번째 카드를 버린다.
            sb.append(cardQueue.poll()).append(" ");
            // 두 번째 카드를 제일 뒤로 보낸다.
            int card = cardQueue.poll();
            cardQueue.add(card);
        }
        
        // 마지막 남은 카드 출력
        sb.append(cardQueue.peek());
        
        System.out.println(sb.toString());
    }
}