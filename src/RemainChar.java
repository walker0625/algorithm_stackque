import java.util.Scanner;
import java.util.Stack;

public class RemainChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(solution(str));
    }

    private static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(char c : str.toCharArray()) {
            if(c == ')') {
                while(st.pop() != '(');
            } else {
                st.push(c);
            }
        }

        for (int i = 0; i < st.size(); i++) {
            answer.append(st.get(i));
        }

        return answer.toString();
    }

}
