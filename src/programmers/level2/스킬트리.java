
import java.util.*;

class Solution {
	public int solution(String skill, String[] skill_trees) {

		String[] skill_set = skill.split("");
		String[][] my_skill_set;

		int answer = 0;
		for (String my_skill_tree : skill_trees)
		{
			answer +=check_skill_available(skill_set, my_skill_tree.split(""));
		}

		return answer;
	}

	private static int check_skill_available(String[] skill_set, String[] my_skill_set)
	{
		int pre_skill_idx = -1;
		boolean learn = true;
		boolean find = false;

		for (int i = 0; i < skill_set.length; i++)
		{
			for (int j = 0; j < my_skill_set.length; j++)
			{
				if (my_skill_set[j].equals(skill_set[i]))
				{
					if ( learn == true && pre_skill_idx < j)
					{
						pre_skill_idx = j;
						find = true;
						break ;
					}
					else
						return 0;
				}
				else
					find = false;
			}
			if (find == false)
				learn = false;
		}

		return 1;
	}
}


/*
1. 다른 스킬이 중간에 껴도 상관없고 skill의 순서만 검사하면 된다.

2. 조건1) 스킬을 찾았을 때, 해당 스킬이 스킬트리 문자열에서 어느 인덱스에 존재하는지 저장한다.
다음 스킬을 찾았을 때, 이 인덱스 보다 큰 인덱스에 존재해야 정상

3. 조건2) 스킬을 찾지 못했을 때, 다음 스킬이 존재하면 안된다.
스킬을 찾지 못한 경우 bool find를 false로 하고 하나의 스킬에 대한 전체 스킬트리 탐색을 마쳤을 떄,
if(!ifind) learn= false로 한다.
다음 스킬을 검사할 떄, learn이 false인데 발견된다면 비정상 스킬트리이다.
*/
