import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CallKout {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();


        System.out.println(solution(n, k));
    }

    private static int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            que.offer(i);
        }

        while(!que.isEmpty()) {
            for (int i = 1; i < k; i++) {
                que.offer(que.poll());
            }
            que.poll();
            if(que.size() == 1) {
                answer = que.poll();
            }
        }

        return answer;
    }
}
