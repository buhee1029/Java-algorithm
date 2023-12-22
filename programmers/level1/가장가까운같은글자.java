package programmers.level1;

import java.util.Arrays;

public class 가장가까운같은글자 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
        System.out.println(Arrays.toString(solution("foobar")));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alphabet = new int[26];

        Arrays.fill(alphabet, -1);

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';

            if (alphabet[idx] > -1) {
                answer[i] = i - alphabet[idx];
            } else {
                answer[i] = -1;
            }

            alphabet[idx] = i;
        }

        return answer;
    }
}
