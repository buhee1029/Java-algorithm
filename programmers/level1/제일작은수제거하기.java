package programmers.level1;

import java.util.Arrays;

public class 제일작은수제거하기 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int minIndex = findMinIndex(arr);
        int[] answer = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != minIndex) {
                answer[j++] = arr[i];
            }
        }

        return answer;
    }

    private static int findMinIndex(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
