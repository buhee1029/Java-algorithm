package programmers.level1;

public class 신규아이디추천 {
    public static void main(String[] args) {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(solution("z-+.^."));
        System.out.println(solution("=.="));
        System.out.println(solution("123_.def"));
        System.out.println(solution("abcdefghijklmn.p"));
    }

    public static String solution(String new_id) {
        StringBuilder answer = new StringBuilder(new_id.toLowerCase());

        answer = new StringBuilder(answer.toString().replaceAll("[^-_.a-z0-9]", ""));
        answer = new StringBuilder(answer.toString().replaceAll("[.]{2,}", "."));
        answer = new StringBuilder(answer.toString().replaceAll("^[.]|[.]$", ""));

        if(answer.length() == 0) answer.append("a");

        if(answer.length() >= 16) {
            answer = new StringBuilder(answer.substring(0, 15));
            answer = new StringBuilder(answer.toString().replaceAll("^[.]|[.]$", ""));
        }

        if(answer.length() <= 2){
            while(answer.length() != 3){
                answer.append(answer.charAt(answer.length() - 1));
            }
        }

        return answer.toString();
    }
}
