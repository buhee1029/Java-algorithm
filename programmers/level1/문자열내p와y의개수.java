package programmers.level1;

public class 문자열내p와y의개수 {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
    }

    public static boolean solution(String s) {
        int count = 0;

        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch == 'p') {
                count++;
            } else if (ch == 'y') {
                count--;
            }
        }

        return count == 0;
    }
}
