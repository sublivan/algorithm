package 문자열;
/*
두 문자열을 비교해서 하나의 문자 삽입, 삭제, 교체 해서 같게 만들 수 있는지
ex1 : pale, ple = true
ex2 : pales, pale = true
ex3 : pale , bale = true
ex4 : pale, bake = false;
....
*/

public class 하나빼기 {

	public static void main(String[] args) {
		String[] s1 = {"pale", "pales", "pale", "pale", "pppa", "pp", "pales"};
		String[] s2 = {"ple", "pale", "bale", "bake", "pppp", "aaa", "apel"};

		for (int i = 0; i < s1.length; i++) {
			boolean answer;

			System.out.println(s1[i] + " & " + s2[i]);
			answer = solution(s1[i], s2[i]);
			System.out.println(answer + "\n");
		}
	}

	private static boolean solution(String str1, String str2)
	{
		int not_same = 0; //같은 위치의 문자가 서로 같은지 판단
		int incount = 0; //비교할 문자열의 문자가 있는지 판단

		int idx1 = 0;
		int idx2 = 0;
		while (idx1 < str1.length() && idx2 < str2.length())
		{
			if (str1.charAt(idx1) != str2.charAt(idx2))
				not_same++;
			if (str1.contains(""+str2.charAt(idx2)))
				incount++;
			idx1++;
			idx2++;
		}
		int abs = Math.abs((str1.length() - str2.length()));
		if (abs >= 2 || (not_same > 2 && str1.length() != str2.length()))
			return false;
		else if ((str1.length() == str2.length() && incount == str1.length() - 1) || incount >= str2.length())
			return true;
		return false;

	}

// //틀린답
//	private  static boolean solution(String str1, String str2)
//	{
//		if (str1.length() < str2.length())
//		{
//			String temp = str1;
//			str1 = str2;
//			str2 = temp;
//		}
//
//		String[] s1 = str1.split("");
//		String[] s2 = str2.split("");
//
//		Map<String, Integer> map = new HashMap<>();
//		if (Math.abs(s1.length - s2.length) >= 2 )
//		    return false;
//
//		for (int i = 0; i < s1.length; i++)
//		{
//		    if (map.containsKey(s1[i]))
//		        map.put(s1[i], map.get(s1[i]) + 1);
//		    else
//		        map.put(s1[i], 1);
//		}
//
//		for (int i = 0; i < s2.length; i++)
//		{
//		    if (map.containsKey(s2[i]))
//		        map.put(s2[i], map.get(s2[i]) - 1);
//		}
//
//		int cnt = 0;
//		for (String s : map.keySet())
//		{
//			System.out.println("key: " + s + " valuse: " +map.get(s));
//		    cnt += map.get(s);
//		}
//
//
// 		System.out.print(cnt);
// 		System.out.println("");
//
//		if (cnt == 1)
//		{
//		    return true;
//		}
//		return false;
//	}
}

/*
참고 : https://hsp1116.tistory.com/41

 */