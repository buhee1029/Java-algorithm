package programmers.level1;

public class 기사단원의무기 {
    public static void main(String[] args) {
        System.out.println(solution(5, 3, 2));
        System.out.println(solution(10, 3, 2));
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        int[] counts = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            int count = countDivisors(i, counts);
            if (count <= limit) {
                answer += count;
            } else {
                answer += power;
            }
        }

        return answer;
    }

    // 소인수분해 활용히여 약수 개수 구하기
    public static int countDivisors(int n, int[] counts) {
        if (counts[n] > 0) {
            return counts[n];
        }

        int count = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }

        counts[n] = count;
        return count;
    }
}
