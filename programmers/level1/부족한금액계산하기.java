package programmers.level1;

public class 부족한금액계산하기 {
    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }

    public static long solution(int price, int money, int count) {
        long totalPrice = (long) price * count * (count + 1) / 2; // 등차수열의 합
        return totalPrice > money ? totalPrice - money : 0;
    }
}
