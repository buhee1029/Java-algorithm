package programmers.level1;

import java.util.*;

public class 달리기경주 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"mumu", "soe", "poe", "kai", "mine"},
                new String[]{"kai", "kai", "mine", "mine"})));
    }

    public static String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++)
            map.put(players[i], i);

        for (String calling : callings) {
            int order = map.get(calling);
            String name = players[order - 1];

            players[order - 1] = players[order];
            players[order] = name;

            map.put(players[order - 1], order - 1);
            map.put(players[order], order);
        }

        return players;
    }

}
