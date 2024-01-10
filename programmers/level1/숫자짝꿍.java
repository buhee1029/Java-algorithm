package programmers.level1;

import java.util.ArrayList;
import java.util.Comparator;

public class 숫자짝꿍 {
    public static void main(String[] args) {
        System.out.println(solution("100", "2345"));
        System.out.println(solution("100", "203045"));
        System.out.println(solution("100", "123450"));
        System.out.println(solution("12321", "42531"));
        System.out.println(solution("5525", "1255"));
    }

    public static String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] numX = new int[10];
        int[] numY = new int[10];

        for(int i = 0; i < X.length(); i++) {
            numX[X.charAt(i) - '0']++;
        }

        for(int i = 0; i < Y.length(); i++) {
            numY[Y.charAt(i) - '0']++;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            if(numX[i] > 0 && numY[i] > 0){
                int tmp = Math.min(numX[i], numY[i]);
                for(int j = 0; j < tmp; j++){
                    list.add(i);
                }
            }
        }

        if (list.isEmpty()) {
            return "-1";
        }

        list.sort(Comparator.reverseOrder());

        if (list.get(0) == 0) {
            return "0";
        }

        for(int num : list) {
            answer.append(num);
        }

        return answer.toString();
    }
}
