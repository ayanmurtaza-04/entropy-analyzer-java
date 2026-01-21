import analyzer.*;
import model.Document;
import utils.FileUtil;

public class Main {

    public static void main(String[] args) {

        Document d1 = new Document(
                "Student1",
                FileUtil.readFile("samples/doc1.txt")
        );

        Document d2 = new Document(
                "Student2",
                FileUtil.readFile("samples/doc2.txt")
        );

        double similarity = SimilarityChecker.calculateSimilarity(
                d1.getContent(),
                d2.getContent()
        );

        double entropy = EntropyCalculator.calculateEntropy(d1.getContent());

        int score = IntegrityScore.calculate(similarity, entropy);

        System.out.println("Similarity: " + (similarity * 100) + "%");
        System.out.println("Entropy: " + entropy);
        System.out.println("Integrity Score: " + score);
    }
}
