package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 괄호가 입력되면 올바른 괄호이면 YES, 올바르지 않으면 NO를 출력한다.
 *
 */
public class 올바른괄호 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] brackets = br.readLine().toCharArray();

        Stack<Character> bracketStack = new Stack<>();

        for (char bracket : brackets) {
            if (bracketStack.isEmpty()) {
                bracketStack.push(bracket);
            } else if (bracketStack.peek() == '(' && bracket == '(') {
                bracketStack.push(bracket);
            } else if (bracketStack.peek() == '(' && bracket == ')') {
                bracketStack.pop();
            }
//            System.out.println("bracketStack status = " + bracketStack);
        }
        System.out.println(bracketStack.size() > 0 ? "NO" : "YES");
    }
}
