package programmers.level1;

import java.util.Arrays;

public class 로또의최고순위와최저순위 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19})));
        System.out.println(Arrays.toString(solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25})));
        System.out.println(Arrays.toString(solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35})));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int same = 0;
        int zero = 0;

        for (int num : lottos) {
            if (num == 0) {
                zero++;
            } else if (contains(win_nums, num)) {
                same++;
            }
        }

        int[] lottoScores = {6, 6, 5, 4, 3, 2, 1};

        int maxRank = lottoScores[same + zero];
        int minRank = lottoScores[same];

        return new int[]{maxRank, minRank};
    }

    private static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
