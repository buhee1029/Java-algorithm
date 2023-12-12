package programmers.level1;

public class 정수제곱근판별 {
    public static void main(String[] args) {
        System.out.println(solution(121));
        System.out.println(solution(3));
    }

    public static long solution(long n) {
        int tmp = (int) Math.sqrt(n);

        if((long) tmp * tmp == n){
            return (long) Math.pow(tmp + 1, 2);
        }else {
            return -1;
        }
    }
}
