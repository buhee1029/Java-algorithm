package programmers.level1;

public class 푸드파이트대회 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 4, 6}));
        System.out.println(solution(new int[]{1, 7, 1, 2}));
    }

    public static String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            answer.append(String.valueOf(i).repeat(Math.max(0, food[i] / 2)));
        }

        StringBuilder sb = new StringBuilder(answer.toString());
        String tmp = sb.reverse().toString();

        answer.append(0);
        answer.append(tmp);

        return answer.toString();
    }

}
