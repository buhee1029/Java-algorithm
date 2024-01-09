package programmers.level1;

import java.util.*;

public class 실패율 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
        System.out.println(Arrays.toString(solution(5, new int[]{1, 1, 1, 2, 3, 4}))); // 4, 1, 3, 2, 5
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] arr = new double[N + 2];
        double total = stages.length;

        for (int stage : stages) {
            arr[stage] += 1;
        }

        HashMap<Integer, Double> map = new HashMap<>();
        map.put(1, arr[1] / total);
        total -= arr[1];

        for (int i = 2; i < arr.length; i++) {
            if (total == 0) map.put(i, 0.0);
            else map.put(i, arr[i] / total);
            total -= arr[i];
        }

        List<Map.Entry<Integer, Double>> list = new LinkedList<>(map.entrySet());
        list.sort((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()));

        int idx = 0;
        for (Map.Entry<Integer, Double> entry : list) {
            if (entry.getKey() == N + 1) continue;
            answer[idx++] = entry.getKey();
        }

        return answer;
    }
}
