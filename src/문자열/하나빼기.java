
/*
두 문자열을 비교해서 하나의 문자 삽입, 삭제, 교체 해서 같게 만들 수 있는지
ex1 : pale, ple = true
ex2 : pales, pale = true
ex3 : pale , bale = true
ex4 : pale, bake = false;

*/

import java.utils.*;

public class 하나빼기{

	public static void main(String[] args) {
		String[] s1 = {"pale", "pales", "pale", "pale", "pppa", "pp", "ppa"};
		String[] s2 = {"ple", "pale", "bale", "bake", "ppppp", "aaa", "paa"};

		for (int i = 0; i < s1.length; i++)
		{
			boolean answer;

			answer = solution(s1[i].split(""), s2[i].split(""));
			System.out.println(answer);
		}

	}

	private  static boolean solution(String[] s1, String[] s2)
	{


		Map<String, Integer> map = new HashMap<>();
		if (Math.abs(s1.length - s2.length) >= 2 )
		    return false;

		for (int i = 0; i < s1.length; i++)
		{
		    if (map.containsKey(s1[i]) == true)
		        map.put(s1[i], map.get(s1[i]) + 1);
		    else
		        map.put(s1[i], 1);
		}

		for (int i = 0; i < s2.length; i++)
		{
		    if (map.containsKey(s2[i]))
		        map.put(s2[i], map.get(s2[i]) - 1);
		}

		int cnt = 0;
		for (String s : map.keySet())
		{
		    cnt += map.get(s);
		}


// 		System.out.print(cnt);
// 		System.out.println("");

		if (cnt == 1)
		{
		    return true;
		}
		return false;
	}
}
