package programmers;

/**
 * num 짝수인 경우 "Even", 홀수인 경우 "Odd"
 */
public class 짝수와홀수 {
    public static void main(String[] args) {
        System.out.println(3);
        System.out.println(4);
    }

    public static String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
