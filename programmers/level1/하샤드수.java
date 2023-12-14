package programmers.level1;

public class 하샤드수 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
    }

    public static boolean solution(int x) {
        return x % calculateDigitSum(x) == 0;
    }

    public static int calculateDigitSum(int x) {
        int sum = 0;

        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }

        return sum;
    }
}
