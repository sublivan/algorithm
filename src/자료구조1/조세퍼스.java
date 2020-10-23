package 자료구조1;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class 조세퍼스{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int rm = Integer.parseInt(str[1]);
        LinkedList<Integer> ls = new LinkedList();
        for (int i = 1; i <= n; i++)
            ls.add(i);
        StringBuilder sb = new StringBuilder();
        int kill=rm-1;
        while (n--!= 0) {
            sb.append(ls.remove(kill));
            if(ls.size() !=0)
                sb.append(", ");
            if(ls.size()==0)
                break;
            kill = (kill+rm-1)%ls.size();
        }
        System.out.print("<"+sb.toString()+">");
    }
}
