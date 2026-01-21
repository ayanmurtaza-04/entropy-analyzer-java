package analyzer;

import java.util.HashMap;

public class EntropyCalculator {

    public static double calculateEntropy(String text) {

        HashMap<Character, Integer> map = new HashMap<>();
        text = text.replaceAll("\\s+", "");

        for (char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        double entropy = 0;

        for (int count : map.values()) {
            double p = (double) count / text.length();
            entropy -= p * (Math.log(p) / Math.log(2));
        }

        return entropy;
    }
}
