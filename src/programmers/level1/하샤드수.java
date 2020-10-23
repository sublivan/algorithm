package programmers.level1;

public class 하샤드수 {
    public boolean solution(int x) {

        int temp = x;
        int sum = 0;
        while(temp > 0)
        {
            sum += temp % 10;
            temp /= 10;
        }
        if(x % sum == 0)
            return true;
        else
            return false;
    }
}
