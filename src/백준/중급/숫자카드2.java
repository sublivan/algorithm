package 백준.중급;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 숫자카드2 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String input = br.readLine();
        String[] st = input.split(" ");

        HashMap<String, Integer> card = new HashMap<>();

        for (int i = 0; i < st.length; i++) {
            Integer c = 0;
            if (!card.containsKey(st[i]))
                card.put(st[i], ++c);
            else
                card.put(st[i], card.get(st[i]) + 1);

        }
        int m =Integer.parseInt(br.readLine());
        String input2 =br.readLine();
        String[] st2 = input2.split(" ");

        StringBuilder result=new StringBuilder();
        for(int j=0;j<m;j++){
            if((card.containsKey(st2[j]))){
                System.out.print(card.get(st2[j]));
            }
            else
                System.out.print("0");

            System.out.print(" ");
        }

    }

}
