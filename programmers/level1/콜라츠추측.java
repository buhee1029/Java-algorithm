package programmers.level1;

public class 콜라츠추측 {
    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
    }

    public static int solution(long num) { // 오버플로우 방지를 위해 num을 long으로 변환
        long answer = 0;

        while (num != 1) {
            if (answer >= 500) return -1;

            num = (num % 2 == 0) ? num / 2 : num * 3 + 1;
            answer++;
        }

        return (int) answer;
    }
}
