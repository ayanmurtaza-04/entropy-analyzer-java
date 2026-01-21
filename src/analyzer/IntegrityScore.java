package analyzer;

public class IntegrityScore {

    public static int calculate(double similarity, double entropy) {

        int score = 100;

        if (similarity > 0.5) {
            score -= 40;
        } else if (similarity > 0.3) {
            score -= 20;
        }

        if (entropy < 3.5) {
            score -= 30;
        }

        return Math.max(score, 0);
    }
}
