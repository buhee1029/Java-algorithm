package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 추억점수 {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(solution(
                        new String[]{"may", "kein", "kain", "radi"},
                        new int[]{5, 10, 1, 3},
                        new String[][]{
                                {"may", "kein", "kain", "radi"},
                                {"may", "kein", "brin", "deny"},
                                {"kon", "kain", "may", "coni"}})
                )
        );
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> nameYearningMap = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            nameYearningMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int totalYearning = 0;

            for (int j = 0; j < photo[i].length; j++) {
                String currentName = photo[i][j];

                if (nameYearningMap.containsKey(currentName)) {
                    totalYearning += nameYearningMap.get(currentName);
                }
            }

            answer[i] = totalYearning;
        }

        return answer;
    }
}
