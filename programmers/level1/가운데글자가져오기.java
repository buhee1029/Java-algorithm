package programmers.level1;

public class 가운데글자가져오기 {
    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }

    public static String solution(String s) {
        int len = s.length();
        int middleIndex = len / 2;

        return (len % 2 != 0) ? String.valueOf(s.charAt(middleIndex)) : s.substring(middleIndex - 1, middleIndex + 1);

    }
}
