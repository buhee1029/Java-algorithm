package programmers.level1;

import java.util.Arrays;

public class 최대공약수와최소공배수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(2, 5)));
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = (n * m) / answer[0];
        return answer;
    }

    /**
     * 호제법 : 두 수를 나누어서 나온 나머지를 이전 나머지에 다시 나누기를 0이 나올때까지 반복
     * >> 바로 직전의 나머지가 최대공약수가 되는 것
     * >> 재귀문, 반복문 방법
     */

    private static int gcd(int n, int m) {
        if (m == 0) return n;
        return gcd(m, n % m);
    }

    private static int gcd2(int n, int m) {
        int a = Math.max(n, m);
        int b = Math.min(n, m);

        int tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }
}
