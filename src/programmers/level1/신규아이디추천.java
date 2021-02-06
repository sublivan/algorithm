package programmers.level1;

// 2021 KAKAO BLIND RECRUITMENT

/*
1 모든 대문자를 소문자로치환
2 알파벳 소문자, 숫자, '.-_' 이외 문자 제거
3  .(마침표)가 2번이상 연속되면 .으로 치환
4. .(마침표)가 처음이나 끝에 위치한다면 제거한다.
5. 빈문자열이면 a 대입
6. id 길이가 16이상이면 첫 15자 문제 빼고 제거
 6-1. 제거후 .(마침표)가 문자 끝에 위치한다면 문자열 끝 마침표 제거
7. 문자열의 길이가 2자 이하라면, 문자열의 길이가 3이될때까지 마지막 문자를 문자열에 추가
 */
public class 신규아이디추천 {

    final static int MAX_ID_LENGTH = 15;
    final static int MIN_ID_LENGTH = 3;

    public String solution(String new_id) {
        String convert = "";

        convert = new_id.toLowerCase() // 1
                .replaceAll("[^a-z0-9._-]", "") // 2
                .replaceAll("[.]{2,}", ".") // 3
                .replaceAll("^\\.|\\.$", ""); // 4

        if (convert.isEmpty()) { // 5
            convert = "a";
        }
        if (convert.length() > MAX_ID_LENGTH) { // 6
            convert = convert.substring(0, MAX_ID_LENGTH)
                             .replaceAll("\\.$", "");

//            if (convert.charAt(convert.length() - 1) == '.' ) {
//                convert = convert.substring(0, convert.length() - 1);
//            }
        }

        if (convert.length() < MIN_ID_LENGTH) { // 7
            convert += new String(convert.charAt(convert.length() - 1) + "").repeat(3 - convert.length());
        }
//        while (convert.length() < MIN_ID_LENGTH) { // 7
//            convert += convert.charAt(convert.length() - 1);
//        }
        return convert;
    }

    public static void main(String[] args) {
        String[] ids = {"...!@BaT#*..y.abcdefghijklm",
                "z-+.^.",
                "=.=",
                "123_.def",
                "abcdefghijklmn.p"
        };

        for (String id : ids) {
            System.out.println(new 신규아이디추천().solution(id));
        }
    }
}
