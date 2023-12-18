package programmers.level1;

public class 삼진법뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution(45));
        System.out.println(solution(125));
    }

    public static int solution(int n) {
        StringBuilder a = new StringBuilder();

        while(n > 0){
            a.insert(0, (n % 3));
            n /= 3;
        }

        a = new StringBuilder(new StringBuilder(a.toString()).reverse().toString());

        return Integer.parseInt(a.toString(),3);
    }
}
