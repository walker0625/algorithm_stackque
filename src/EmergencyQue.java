import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EmergencyQue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.offer(new Person(i, arr[i]));
        }

        while(!q.isEmpty()) {
            Person tmp = q.poll();
            for(Person p : q) {
                if(p.priority > tmp.priority) {
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null) {
                answer++;
                if (tmp.id == m) {
                    return answer;
                } else {
                    answer++;
                }
            }
        }

        return answer;
    }

}

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
