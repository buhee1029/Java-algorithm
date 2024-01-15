package programmers.level1;

import java.util.HashMap;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"leo", "kiki", "eden"},
                new String[]{"eden", "kiki"}));
    }

    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String name : completion) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for (String name : participant) {
            if (map.containsKey(name)) {
                map.put(name, map.get(name) - 1);
                if (map.get(name) == 0) {
                    map.remove(name);
                }
            } else {
                return name;
            }
        }

        return null;

        /**
         * Arrays.sort(participant);
         * Arrays.sort(completion);
         *
         * for (int i = 0; i < completion.length; i++) {
         *         if (!participant[i].equals(completion[i])) {
         *             return participant[i];
         *         }
         * }
         *
         * return participant[participant.length - 1];
         */
    }
}
