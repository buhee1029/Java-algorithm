package programmers.level1;

public class 키패드누르기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
        System.out.println(solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
    }

    private static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int posL = -1, posR = -1;

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                posL = number;
            } else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                posR = number;
            } else {
                int distL = getDistance(number, posL);
                int distR = getDistance(number, posR);

                if (distL > distR) {
                    answer.append("R");
                    posR = number;
                } else if (distL < distR) {
                    answer.append("L");
                    posL = number;
                } else {
                    if (hand.equals("right")) {
                        answer.append("R");
                        posR = number;
                    } else {
                        answer.append("L");
                        posL = number;
                    }
                }
            }
        }

        return answer.toString();
    }

    private static int getDistance(int number, int position) {
        int[][] keypad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, -1}};
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (keypad[i][j] == number) {
                    x1 = i;
                    y1 = j;
                }
                if (keypad[i][j] == position) {
                    x2 = i;
                    y2 = j;
                }
            }
        }

        return Math.abs(x2 - x1) + Math.abs(y2 - y1);
    }
}
