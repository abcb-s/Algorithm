import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<String> workers = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String work = sc.next();

            if (work.equals("enter")) {
                workers.add(name);
            } else {
                workers.remove(name);
            }
        }

        List<String> result = new ArrayList<>(workers);
        Collections.sort(result, Collections.reverseOrder());

        for (String name : result) {
            System.out.println(name);
        }
    }
}