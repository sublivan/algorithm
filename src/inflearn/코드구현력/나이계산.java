package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 주민등록증의 번호가 주어지면 주민등록증 주인의 나이와 성별을 판단하여 출력하는 프로그램을 작성하라
 *
 * 주민등록증의 번호는 -를 기준으로 앞자리와 뒷자리로 구분된다.
 * 뒷자리의 첫 번째 수가 1이면 1900년대생 남자이고, 2이면 1900년대생 여자, 3이면 2000년대생 남자, 4이면 2000년대생 여자이다.
 *
 * 올해는 2019년이다. 해당 주민등록증 주인의 나이와 성별을 출력하라
 */
public class 나이계산 {

    public static void main(String[] args) throws IOException {
        final int YEAR = 2019;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split("-");

        int genderCode = Integer.parseInt(inputs[1].substring(0, 1));
        int birthYear = getBirthYear(inputs[0], genderCode);

        String gender = convertGender(genderCode);
        int age = YEAR + 1 - birthYear;

        System.out.println(age + " " + gender);
    }

    private static String convertGender(int genderCode) {
        String gender = "M";
        if (genderCode == 2 || genderCode == 4) {
            gender = "W";
        }
        return gender;
    }

    private static int getBirthYear(String birthDate, int genderCode) {
        int birthYear = Integer.parseInt(birthDate.substring(0, 2));

        if (genderCode == 1 || genderCode == 2) {
            birthYear += 1900;
        } else if (genderCode == 3 || genderCode == 4) {
            birthYear += 2000;
        }
        return birthYear;
    }
}
