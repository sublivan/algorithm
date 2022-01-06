package baekjoon.자료구조1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class 에디터 {

    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String input =br.readLine();
        Stack<Character> stack= new Stack<>();
        Stack<Character> stack_c =new Stack<>();

        for(int i=0; i<input.length();i++)
            stack.push(input.charAt(i));
        int n=Integer.parseInt(br.readLine());

        for(int j=0; j<n ; j++){
            String cmd=br.readLine();
            if(cmd.charAt(0)=='L') {
                if (!stack.empty())
                    stack_c.push(stack.pop());
            }
            else if(cmd.charAt(0)=='D') {
                if (!stack_c.empty())
                    stack.push(stack_c.pop());
            }
            else if(cmd.charAt(0)=='B') {
                if (!stack.empty())
                    stack.pop();
            }
            else if(cmd.charAt(0)=='P') {
                stack.push(cmd.charAt(2));
            }

        }
        while(!stack.empty())
            stack_c.push(stack.pop());
        StringBuffer result =new StringBuffer();
        while (!stack_c.empty())
            result.append(stack_c.pop());
        System.out.println(result.toString());
    }
}
