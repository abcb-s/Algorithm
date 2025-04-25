import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력 최적화를 위한 StringBuilder
        StringBuilder sb = new StringBuilder();
        
        // 명령 수 입력
        int N = Integer.parseInt(br.readLine());
        
        // 큐 선언
        Deque<Integer> queue = new ArrayDeque<>();
        
        // 명령 처리
        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            
            if (command.startsWith("push")) {
                int value = Integer.parseInt(command.split(" ")[1]);
                queue.offer(value);
            } else if (command.equals("pop")) {
                sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
            } else if (command.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (command.equals("empty")) {
                sb.append(queue.isEmpty() ? 1 : 0).append("\n");
            } else if (command.equals("front")) {
                sb.append(queue.isEmpty() ? -1 : queue.peekFirst()).append("\n");
            } else if (command.equals("back")) {
                sb.append(queue.isEmpty() ? -1 : queue.peekLast()).append("\n");
            }
        }
        
        // 결과 출력
        System.out.print(sb);
    }
}