package 자료구조1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 큐 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> que =new LinkedList<>();

        String[] str;
        String back="";
        for(int i=0; i<n;i++){
            str=br.readLine().split(" ");

            switch (str[0]){
                case "push":
                    que.add(Integer.parseInt(str[1]));
                    back=str[1];
                    break;
                case "pop":
                    System.out.println(que.isEmpty()?-1:que.poll());
                    break;
                case "size":
                    System.out.println(que.size());
                    break;
                case "empty":
                    System.out.println(que.isEmpty()?1:0);
                    break;
                case "front":
                    System.out.println(que.isEmpty()?-1:que.peek());
                    break;
                case "back":
                    System.out.println(que.isEmpty()?-1:back);
                    break;

            }
        }
    }
}
