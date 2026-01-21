package analyzer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SimilarityChecker {

    public static double calculateSimilarity(String text1, String text2) {
        // Split each text into words (simple whitespace split)
        String[] words1 = text1.split("\\s+");
        String[] words2 = text2.split("\\s+");

        // Use HashSet to automatically ignore duplicates
        Set<String> set1 = new HashSet<>(Arrays.asList(words1));
        Set<String> set2 = new HashSet<>(Arrays.asList(words2));

        // Find common words
        Set<String> common = new HashSet<>(set1);
        common.retainAll(set2); // keeps only words present in both sets

        // Calculate Jaccard similarity (intersection / union)
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);

        return (double) common.size() / union.size();
    }
}

