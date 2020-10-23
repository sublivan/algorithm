package 자료구조1;

import java.util.*;

public class 쇠막대기 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input=sc.next();

        int result=0;
        Stack<Character> st =new Stack<>();

        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)=='('){
                st.push(input.charAt(i));
            }
            else{
                st.pop();
                //레이저 일때, 막대나누기
                if(input.charAt(i-1)=='(') {
                    result += st.size();
                }
                //막대의 끝일때
                else
                    result++;
            }
        }
        System.out.println(result);

    }
}