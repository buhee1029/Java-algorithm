package programmers.level1;

public class 소수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(5));
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                answer++;
            }
        }
        return answer;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
