package programmers.level1;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    public static long solution(long n) {
        char[] digits = Long.toString(n).toCharArray();
        Arrays.sort(digits);

        StringBuilder answer = new StringBuilder();
        for (int i = digits.length - 1; i >= 0; i--) {
            answer.append(digits[i]);
        }

        return Long.parseLong(answer.toString());
    }
}
