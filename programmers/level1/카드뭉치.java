package programmers.level1;

public class 카드뭉치 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"i", "drink", "water"},
                new String[]{"want", "to"},
                new String[]{"i", "want", "to", "drink", "water"}));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;

        for(String str : goal) {
            if(idx1 < cards1.length && str.equals(cards1[idx1])) {
                idx1++;
            }else if(idx2 < cards2.length && str.equals(cards2[idx2])) {
                idx2++;
            }else {
                return "No";
            }
        }

        return "Yes";
    }
}
