package programmers.level1;

import java.util.*;

public class 모의고사 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 2, 4, 2})));
    }

    public static int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) score[0]++;
            if (answers[i] == two[i % two.length]) score[1]++;
            if (answers[i] == three[i % three.length]) score[2]++;
        }

        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            if (maxScore == score[i]) list.add(i + 1);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
