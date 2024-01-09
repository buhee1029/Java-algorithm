package programmers.level1;

import java.util.ArrayList;

public class 다트게임 {
    public static void main(String[] args) {
        System.out.println(solution("1S2D*3T"));
        System.out.println(solution("1D2S#10S"));
        System.out.println(solution("1D2S0T"));
        System.out.println(solution("1S*2T*3S"));
        System.out.println(solution("1D#2S*3S"));
        System.out.println(solution("1T2D3D#"));
        System.out.println(solution("1D2S3T*"));
    }

    public static int solution(String dartResult) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        int tmp = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (Character.isDigit(c)) {
                tmp = tmp * 10 + (c - '0');
            } else if (c == 'S' || c == 'D' || c == 'T') {
                int score = (c == 'S') ? tmp : (c == 'D') ? tmp * tmp : tmp * tmp * tmp;
                list.add(score);
                tmp = 0;
            } else if (c == '*') {
                int cur = list.size() - 1;
                if (cur > 0) {
                    list.set(cur - 1, list.get(cur - 1) * 2);
                }
                list.set(cur, list.get(cur) * 2);
            } else if (c == '#') {
                int cur = list.size() - 1;
                list.set(cur, list.get(cur) * (-1));
            }
        }

        for(int num : list) {
            answer += num;
        }

        return answer;
    }
}
