package programmers.level1;

import java.util.*;

public class 둘만의암호 {
    public static void main(String[] args) {
        System.out.println(solution("aukks", "wbqd", 5));
    }

    public static String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder(s.length());

        Set<Character> skipSet = new HashSet<>();
        for (char c : skip.toCharArray()) {
            skipSet.add(c);
        }

        for (char c : s.toCharArray()) {
            int cnt = 0;
            char tmp = c;

            while (cnt != index) {
                tmp++;

                if (tmp > 'z') {
                    tmp = 'a';
                }

                if (!skipSet.contains(tmp))
                    cnt++;
            }
            answer.append(tmp);
        }

        return answer.toString();
    }
}
