package goorm;

import java.io.*;
import java.util.StringTokenizer;

//통과못함
public class 사은품교환하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Long[] answer = new Long[T];
        for(int i=0; i<T; i++){
            String str = br.readLine();
            Long N = Long.parseLong(str.split(" ")[0]);
            Long K = Long.parseLong(str.split(" ")[1]);

            Long sum = (N+K)/12;
            Long p = N/5;
            answer[i] = sum>p?p:sum;
        }

        for(Long i:answer){
            System.out.println(i);
        }

        br.close();
    }
}

// 5 pass 런타임에러
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringTokenizer st;
//
//        int[] answer = new int[t];
//
//        while (t-- > 0) {
//            int result = 0;
//            st = new StringTokenizer(br.readLine());
//            double n = Integer.parseInt(st.nextToken());
//            double m = Float.parseFloat(st.nextToken());
//
//
//            double sum = (n + m) / 12;
//            double p = n / 5;
//            result = (int) (sum > p ? p : sum);
//            System.out.println(result);
//        }
//
//
//
//    }
//
//}

//3pass error
//            while((n>=5 && m >=6) || n>=12 || m>=12){
//                if(n<5 || n<0){
//                    break;
//                }
//                if(n>=5 && m >=6){
//                    if(n+m <12)
//                        break;
//                    result++;
//                    n -=5;
//                    m -=7;
//                }
//                else if(n>=12){
//                    n -=12;
//                    result++;
//                }
//            }

