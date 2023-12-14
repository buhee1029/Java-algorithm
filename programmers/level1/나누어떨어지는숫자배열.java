package programmers.level1;

import java.util.*;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(Arrays.toString(solution(arr, divisor)));
    }

    public static int[] solution(int[] arr, int divisor) {
        int count = 0;

        for (int num : arr) {
            if (num % divisor == 0) {
                count++;
            }
        }

        if (count == 0) {
            return new int[]{-1};
        }

        int[] answer = new int[count];
        int index = 0;

        for (int num : arr) {
            if (num % divisor == 0) {
                answer[index++] = num;
            }
        }

        Arrays.sort(answer);
        return answer;
    }
}
