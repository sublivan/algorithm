package 알고리즘;

/*
에라토스테네스의체
- 소수판별 알고리즘

소수(prime number)
- 양의 약스를 두개만 가지는 정수, 1과 자기자신
예) 2, 3, 5, 7, 9~~


 */
public class 에라토스테네스의체 {
    //10만까지 소수 판별
    static int number = 100000;
    static int[] a= new int[100001];

    public static void main(String[] args) {
        primeNumberSieve();

    }
    //소수판별 알고리즘
    static void primeNumberSieve(){

        for(int i=1; i<=number; i++){
            a[i] = i;
        }
        //1은 자기 자신 밖에 없기때문에 제외
        // 2부터 i에 배수들을 삭제
        for(int i =2; i<=number; i++){
            if(a[i] == 0) continue;
            for(int j = i+i; j<=number ; j +=i){
                a[j] = 0;
            }
        }
        for(int i=1; i<=number ;i++){
            if(a[i] != 0){
                System.out.print(a[i]+" ");
            }
        }
    }
}

