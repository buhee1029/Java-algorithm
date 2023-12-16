package programmers.level1;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }

    public static String solution(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);

        StringBuilder answer = new StringBuilder(new String(charArr));
        return answer.reverse().toString();
    }
}
