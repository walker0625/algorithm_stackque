import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ClassQue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ec = sc.next();
        String cl = sc.next();

        System.out.println(solution(ec, cl));
    }

    private static String solution(String ec, String cl) {
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();

        for(char c : ec.toCharArray()) {
            q.offer(c);
        }

        for(char c : cl.toCharArray()) {
            if(q.contains(c)) {
                if(c != q.poll()) {
                    return "NO";
                }
            }
        }

        if(!q.isEmpty()) {
            return "NO";
        }

        return answer;
    }

}
