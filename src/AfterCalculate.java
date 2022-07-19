import java.util.Scanner;
import java.util.Stack;

public class AfterCalculate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        Stack<Integer> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
                stack.push(c-48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(c=='+'){
                    stack.push(lt +rt);
                } else if(c=='-'){
                    stack.push(lt - rt);
                } else if(c=='*'){
                    stack.push(lt * rt);
                } else if(c=='/'){
                    stack.push(lt / rt);
                }
            }
        }

        return stack.get(0);
    }

}
