package programmers.level1;

public class 없는숫자더하기 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,0};
        System.out.println(solution(arr));
    }

    public static int solution(int[] numbers) {
        int answer = 45;

        for (int number : numbers) {
            answer -= number;
        }

        return answer;
    }
}
