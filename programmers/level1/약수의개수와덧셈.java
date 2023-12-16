package programmers.level1;

public class 약수의개수와덧셈 {
    public static void main(String[] args) {
        System.out.println(solution(13, 17));
        System.out.println(solution(24, 27));
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i) { // i가 완전제곱수인 경우
                answer -= i;
            } else { // i가 완전제곱수가 아닌 경우
                answer += i;
            }
        }

        return answer;
    }
}
