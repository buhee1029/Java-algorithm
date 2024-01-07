package programmers.level1;

public class 문자열나누기 {
    public static void main(String[] args) {
        System.out.println(solution("banana"));
        System.out.println(solution("aaabbaccccabba"));
        System.out.println(solution("abracadabra"));
    }

    public static int solution(String s) {
        int answer = 1;

        char start = s.charAt(0);
        int startCount = 1;
        int otherCount = 0;

        for (int i = 1; i < s.length(); i++) {
            if(startCount == otherCount){
                answer++;
                start = s.charAt(i);
                startCount = 1;
                otherCount = 0;
                continue;
            }

            if(s.charAt(i) == start) {
                startCount++;
            }else {
                otherCount++;
            }
        }

        return answer;
    }
}
