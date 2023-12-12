package programmers.level1;

import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }

    public static int[] solution(long num) {
        int n = (int) (Math.log10(num) + 1);
        int[] answer = new int[n];

        for(int idx = 0; idx < n; idx++){
            answer[idx] = (int) (num%10);
            num /= 10;
        }

        return answer;
    }
}
