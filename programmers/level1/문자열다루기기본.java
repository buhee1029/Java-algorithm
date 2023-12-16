package programmers.level1;

public class 문자열다루기기본 {
    public static void main(String[] args) {
        System.out.println(solution("a234"));
        System.out.println(solution("1234"));
    }

    public static boolean solution(String s) {
        return s.matches("\\d{4}|\\d{6}");
    }
}
