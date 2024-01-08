package programmers.level1;

public class 덧칠하기 {
    public static void main(String[] args) {
        System.out.println(solution(8, 4, new int[]{2, 3, 6}));
        System.out.println(solution(5, 4, new int[]{1, 3}));
        System.out.println(solution(4, 1, new int[]{1, 2, 3, 4}));


    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = 0;

        for (int i = 1; i < section.length; i++) {
            if (section[i] - section[start] + 1 > m) {
                answer++;
                start = i;
            }
        }

        return answer + 1;
    }
}
