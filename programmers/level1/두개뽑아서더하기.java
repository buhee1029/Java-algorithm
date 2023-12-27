package programmers.level1;

import java.util.Arrays;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 3, 4, 1})));
        System.out.println(Arrays.toString(solution(new int[]{5, 0, 2, 7})));
    }

    public static int[] solution(int[] numbers) {
        boolean[] sumExists = new boolean[201]; // 최대 숫자의 두 배의 크기

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                sumExists[sum] = true;
            }
        }

        // 중복 확인 배열을 기반으로 결과 배열 생성
        int count = 0;
        for (boolean exists : sumExists) {
            if (exists) count++;
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < sumExists.length; i++) {
            if (sumExists[i]) {
                result[index++] = i;
            }
        }

        return result;
    }
}
