package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class 성격유형검사하기 {
    public static void main(String[] args) {
        System.out.println(solution1(
                new String[]{"AN", "CF", "MJ", "RT", "NA"},
                new int[]{5, 3, 2, 7, 5}));

        System.out.println(solution2(
                new String[]{"TR", "RT", "TR"},
                new int[]{7, 1, 3}));
    }

    public static String solution1(String[] survey, int[] choices) {
        String answer = "";

        int[] score = {0, 3, 2, 1, 0, 1, 2, 3};

        int[] RT = new int[2];
        int[] CF = new int[2];
        int[] JM = new int[2];
        int[] AN = new int[2];

        for (int i = 0; i < choices.length; i++) {
            int choice = choices[i];
            char check = 0;

            if (choice > 4) {
                check = survey[i].charAt(1);
            } else if (choice < 4) {
                check = survey[i].charAt(0);
            }

            int tmp = score[choice];

            switch (check) {
                case 'R' -> RT[0] += tmp;
                case 'T' -> RT[1] += tmp;
                case 'C' -> CF[0] += tmp;
                case 'F' -> CF[1] += tmp;
                case 'J' -> JM[0] += tmp;
                case 'M' -> JM[1] += tmp;
                case 'A' -> AN[0] += tmp;
                case 'N' -> AN[1] += tmp;
            }
        }

        if (RT[0] >= RT[1]) {
            answer += "R";
        } else {
            answer += "T";
        }

        if (CF[0] >= CF[1]) {
            answer += "C";
        } else {
            answer += "F";
        }

        if (JM[0] >= JM[1]) {
            answer += "J";
        } else {
            answer += "M";
        }

        if (AN[0] >= AN[1]) {
            answer += "A";
        } else {
            answer += "N";
        }

        return answer;
    }

    public static String solution2(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            int choice = choices[i];

            if (choice > 0 && choice < 4) {
                char ch = survey[i].charAt(0);
                map.put(ch, map.getOrDefault(ch, 0) + 4 - choice);
            } else if (choice > 4) {
                char ch = survey[i].charAt(1);
                map.put(ch, map.getOrDefault(ch, 0) + choice - 4);
            }

        }

        return String.valueOf(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T') +
                (map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? 'C' : 'F') +
                (map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? 'J' : 'M') +
                (map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? 'A' : 'N');
    }
}
