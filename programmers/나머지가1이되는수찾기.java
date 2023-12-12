package programmers;

public class 나머지가1이되는수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
    }

    public static int solution(int n) {
        int answer = 1;

        while (n % answer != 1) {
            answer++;
        }

        return answer;
    }
}
