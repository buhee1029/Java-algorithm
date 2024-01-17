package programmers.level1;

import java.util.*;

public class 체육복 {
    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        System.out.println(solution(5, new int[]{2, 4}, new int[]{3}));
        System.out.println(solution(5, new int[]{1, 2, 3}, new int[]{2, 3, 4}));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        for (int i : reserve) {
            reserveSet.add(i);
        }

        for (int i : lost) {
            if (reserveSet.contains(i)) {
                reserveSet.remove(i);
            } else {
                lostSet.add(i);
            }
        }


        for (Integer i : reserveSet) {
            if (lostSet.contains(i - 1)) {
                lostSet.remove(i - 1);
            } else lostSet.remove(i + 1);
        }

        return n - lostSet.size();
    }
}
