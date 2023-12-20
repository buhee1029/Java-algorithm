package programmers.level1;

public class 이상한문자만들기 {
    public static void main(String[] args) {
        System.out.println(solution(" try hello world "));
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean flag = true;

        for (char c : s.toCharArray()) {
            if (Character.isWhitespace(c)) {
                flag = true;
                answer.append(c);
            } else {
                if (flag) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                flag = !flag;
            }
        }

        return answer.toString();
    }
}
