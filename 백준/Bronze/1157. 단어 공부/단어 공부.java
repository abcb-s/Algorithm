import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> countMap = new HashMap<>();

        // 각 알파벳을 대문자로 변환해서 Map에 개수 세기
        for (int i = 0; i < input.length(); i++) {
            String ch = (input.charAt(i) + "").toUpperCase();
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        // 최댓값 찾기
        int maxCount = 0;
        String maxChar = "";
        boolean duplicate = false;

        for (String key : countMap.keySet()) {
            int value = countMap.get(key);
            if (value > maxCount) {
                maxCount = value;
                maxChar = key;
                duplicate = false;
            } else if (value == maxCount) {
                duplicate = true;
            }
        }

        // 결과 출력
        if (duplicate) {
            System.out.println("?");
        } else {
            System.out.println(maxChar);
        }
    }
}