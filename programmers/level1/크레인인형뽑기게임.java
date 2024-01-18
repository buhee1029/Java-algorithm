package programmers.level1;

import java.util.*;

public class 크레인인형뽑기게임 {
    public static void main(String[] args) {
        int result = solution(
                new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 3},
                        {0, 2, 5, 0, 1},
                        {4, 2, 4, 4, 2},
                        {3, 5, 1, 3, 1}},
                new int[]{1, 5, 3, 5, 1, 2, 1, 4});

        System.out.println(result);
    }

    private static int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> basket = new ArrayList<>();

        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] != 0) {
                    if (!basket.isEmpty() && basket.get(basket.size() - 1) == board[i][move - 1]) {
                        basket.remove(basket.size() - 1);
                        answer += 2;
                    } else {
                        basket.add(board[i][move - 1]);
                    }

                    board[i][move - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
