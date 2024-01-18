package programmers.level1;

public class 이웃한칸 {
    public static void main(String[] args) {
        System.out.println(solution(
                new String[][]{
                        {"blue", "red", "orange", "red"},
                        {"red", "red", "blue", "orange"},
                        {"blue", "orange", "red", "red"},
                        {"orange", "orange", "red", "blue"}}, 1, 1));

        System.out.println(solution(
                new String[][]{
                        {"yellow", "green", "blue"},
                        {"blue", "green", "yellow"},
                        {"yellow", "blue", "blue"}}, 0, 1));
    }

    public static int solution(String[][] board, int h, int w) {
        int answer = 0;
        String cur = board[h][w];

        if (h - 1 >= 0 && board[h - 1][w].equals(cur)) {
            answer++;
        }

        if (h + 1 < board[0].length && board[h + 1][w].equals(cur)) {
            answer++;
        }

        if (w - 1 >= 0 && board[h][w - 1].equals(cur)) {
            answer++;
        }

        if (w + 1 < board.length && board[h][w + 1].equals(cur)) {
            answer++;
        }

        return answer;
    }
}
