import java.util.Random;

public class ServerNameGenerator {

    private static String[] nouns = {
        "trouble",
        "pigs",
        "cabbage",
        "dog",
        "work",
        "interest",
        "twist",
        "nerve",
        "frog",
        "bee"
    };

    private static String[] adjectives = {
        "overwrought",
        "hesitant",
        "encouraging",
        "disturbed",
        "holistic",
        "reminiscent",
        "fabulous",
        "workable",
        "boundless",
        "trite"
    };

    private static String getRandomElement(String[] strings) {
        return strings[getRandomNumberInRange(strings.length -1)];
    }

    private static int getRandomNumberInRange(int max) {
        Random r = new Random();
        return r.nextInt(max);
    }

    public static void main(String[] args) {

        System.out.printf(
                "Here is your server name:%n%s-%s",
                getRandomElement(adjectives),
                getRandomElement(nouns));
        System.out.println();
    }

}
