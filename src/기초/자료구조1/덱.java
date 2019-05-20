package 기초.자료구조1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class 덱 {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());

        String str[];
        Deque<Integer> deq= new LinkedList<>();

        while(n-- !=0){
            str=br.readLine().split(" ");

            switch (str[0]){
                case "push_front":
                    deq.addFirst(Integer.parseInt(str[1]));
                    break;
                case "push_back":
                        deq.addLast(Integer.parseInt(str[1]));
                    break;
                case "pop_front":
                    System.out.println(deq.isEmpty()?-1:deq.pollFirst());
                    break;
                case "pop_back":
                    System.out.println(deq.isEmpty()?-1:deq.pollLast());
                    break;
                case "size":
                    System.out.println(deq.size());
                    break;
                case "empty":
                    System.out.println(deq.isEmpty()?1:0);
                    break;
                case "front":
                    System.out.println(deq.isEmpty()?-1:deq.peekFirst());
                    break;
                case "back":
                    System.out.println(deq.isEmpty()?-1:deq.peekLast());
                    break;

            }
        }
    }
}
