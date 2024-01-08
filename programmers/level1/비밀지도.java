package programmers.level1;

import java.util.Arrays;

public class 비밀지도 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
        System.out.println(Arrays.toString(solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10})));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            int map = arr1[i] | arr2[i]; // 비트 OR 연산을 통해 지도 생성
            StringBuilder str = new StringBuilder();

            for (int j = 0; j < n; j++) {
                str.insert(0, (map & 1) == 1 ? '#' : ' '); // 비트를 오른쪽부터 가져와서 '#' 또는 ' ' 추가
                map >>= 1; // 비트를 오른쪽으로 1칸 이동
            }

            answer[i] = str.toString();
        }

        /**
         *  실패 - 런타임에러
         * for (int i = 0; i < n; i++) {
         *   String binary1 = String.format("%0" + n + "d", Integer.parseInt(Integer.toBinaryString(arr1[i])));
         *   String binary2 = String.format("%0" + n + "d", Integer.parseInt(Integer.toBinaryString(arr2[i])));
         *
         *   StringBuilder str = new StringBuilder();
         *   for (int j = 0; j < n; j++) {
         *      if (binary1.charAt(j) == '1' || binary2.charAt(j) == '1') {
         *          str.append("#");
         *      } else if (binary1.charAt(j) == '0' && binary2.charAt(j) == '0') {
         *          str.append(" ");
         *      }
         *   }
         *
         *   answer[i] = str.toString();
         * }
         */

        return answer;
    }
}
