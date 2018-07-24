import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What's your age?");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Your age is: " + age);

        System.out.println("Give me the first word");
        String word1 = sc.nextLine();
        System.out.println("Give me the second word");
        String word2 = sc.nextLine();
        System.out.println("Give me the third word");
        String word3 = sc.nextLine();

        System.out.printf("Your words: %s %s %s", word1, word2, word3);

        System.out.println("Give me a sentence");
        String sentence = sc.nextLine();

        System.out.println(sentence);

        System.out.println("Give me the length");
        String length = sc.nextLine();
        System.out.println("Give me the width");
        String width = sc.nextLine();

        double area = Double.parseDouble(length)  * Double.parseDouble(width);
        System.out.println(area + " = "+length+" x "+width);

        double perimeter = (2 * Double.parseDouble(length)) + ( 2 * Double.parseDouble(width));

        System.out.println(perimeter + " = 2x"+length+" + 2x"+width);


    }
}
