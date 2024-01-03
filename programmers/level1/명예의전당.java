package programmers.level1;

import java.util.*;

public class 명예의전당 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> rank = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            rank.offer(score[i]);

            if (rank.size() > k) {
                rank.poll();
            }

            answer[i] = rank.peek();
        }

        return answer;
    }
}
