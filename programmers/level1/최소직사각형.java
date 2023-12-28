package programmers.level1;

public class 최소직사각형 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }

    public static int solution(int[][] sizes) {
        int minWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            int currentMin = Math.min(size[0], size[1]);
            int currentMax = Math.max(size[0], size[1]);

            minWidth = Math.max(minWidth, currentMin);
            maxHeight = Math.max(maxHeight, currentMax);
        }

        return minWidth * maxHeight;
    }
}
