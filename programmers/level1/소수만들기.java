package programmers.level1;

import java.util.Arrays;

public class 소수만들기 {
    static int[] arr, select;
    static int answer;
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}));
        System.out.println(solution(new int[]{1, 2, 7, 6, 4}));
    }

    public static int solution(int[] nums) {
        answer = 0;
//        arr = Arrays.copyOf(nums, nums.length);
//        select = new int[3];
//        combination(0, 0);

        for(int i = 0; i < nums.length - 2; i ++){
            for(int j = i + 1; j < nums.length - 1; j ++){
                for(int k = j + 1; k < nums.length; k ++ ){
                    if(isPrime(nums[i] + nums[j] + nums[k])){
                        answer += 1;
                    }
                }
            }
        }

        return answer;
    }

    public static void combination(int idx, int k) {
        if (k == select.length) {
            int sum = Arrays.stream(select).sum();
            if(isPrime(sum)) answer++;
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            select[k] = arr[i];
            combination(i + 1, k + 1);
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
