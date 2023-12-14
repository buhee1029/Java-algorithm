package programmers.level1;

public class 두정수사이의합 {
    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        System.out.println(solution(3, 3));
        System.out.println(solution(5, 3));
    }

    public static long solution(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // 등차수열의 합 공식 사용
        long answer = (long) (b - a + 1) * (a + b) / 2;

        return answer;
    }
}
