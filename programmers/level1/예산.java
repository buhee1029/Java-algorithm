package programmers.level1;

import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,2,5,4}, 9));
        System.out.println(solution(new int[]{2,2,3,3}, 10));
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        int remaining = budget;

        Arrays.sort(d);

        for (int n : d) {
            if (remaining< n) {
                break;
            }

            remaining -= n;
            answer++;
        }

        return answer;
    }
}
