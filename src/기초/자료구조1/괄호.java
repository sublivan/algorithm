package 기초.자료구조1;

import java.util.*;

public class 괄호 {

    public static void main(String[] args) throws  Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input;

        for(int i=0; i<n ; i++) {
            input = sc.next();
            String vps = "YES";
            Stack<Character> stack =new Stack<>();

            for (int j = 0; j < input.length() ; j++) {

                char c = input.charAt(j);

                if (c == '(') {
                    stack.push(c);
                }
                else if(c == ')') {
                    if (!stack.isEmpty())
                        stack.pop();
                    else {
                        vps = "NO";
                        break;
                    }
                }
            }
            if(!stack.isEmpty())
                vps ="NO";

            System.out.println(vps);


        }

    }
}
