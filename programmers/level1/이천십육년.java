package programmers.level1;

import java.time.LocalDate;

public class 이천십육년 {
    public static void main(String[] args) {
        System.out.println(solution(5, 24));
    }

    public static String solution(int a, int b) {
        String[] dayOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        LocalDate date = LocalDate.of(2016, a, b);

        return dayOfWeek[date.getDayOfWeek().ordinal()];
    }
}
