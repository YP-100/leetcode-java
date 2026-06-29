import java.util.*;

class Solution {
    public int maxNumberOfBalloons(String text) {
        //resubmit for repo

        Map<String, Integer> dictb = new HashMap<>(Map.of(
                "b", 0,
                "a", 0,
                "l", 0,
                "o", 0,
                "n", 0
        ));

        for (String ch : text.split("")) {
            if (dictb.containsKey(ch)) {
                dictb.put(ch, dictb.get(ch) + 1);
            }
        }

        int min = Math.min(
                Math.min(dictb.get("b"), dictb.get("a")),
                Math.min(dictb.get("n"),
                        Math.min(dictb.get("l") / 2, dictb.get("o") / 2))
        );

        return min;
    }
}