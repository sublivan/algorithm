package programmers.level2;

import java.util.Stack;

public class 올바른괄호 {

    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray() ) {
            if (stack.isEmpty() && c == ')') {
                return false;
            }
            if (c == '(') {
                stack.push(c);
                continue;
            }
            if (!stack.isEmpty() && c == ')') {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}

/*
여는 괄호 닫는 괄호 짝이 맞으면 true
그렇지 않으면 false 리턴

stack을 이용해서 여는 괄호일때 push 닫는 괄호 나오면 pop
마지막에 stack에 남는 괄호가 있으면 올바르지 않은 괄호
 */
