package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 대충만든자판 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"})));
        System.out.println(Arrays.toString(solution(new String[]{"AA"}, new String[]{"B"})));
        System.out.println(Arrays.toString(solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA", "BGZ"})));
    }

    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();

        for (String row : keymap) {
            for (int i = 0; i < row.length(); i++) {
                char key = row.charAt(i);
                map.putIfAbsent(key, i + 1);
                map.replace(key, Math.min(map.get(key), i + 1));
            }
        }

        for (int i = 0; i < targets.length; i++) {
            boolean flag = true;
            int sum = 0;

            for (char c : targets[i].toCharArray()) {
                if (map.containsKey(c)) {
                    sum += map.get(c);
                } else {
                    flag = false;
                    break;
                }
            }

            // 만약 문자열에 keymap에 없는 문자가 있다면 -1
            answer[i] = flag ? sum : -1;
        }

        return answer;
    }
}
