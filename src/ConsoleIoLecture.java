import java.util.Scanner;

public class ConsoleIoLecture {

    public static void main(String[] args) {

    // ================================== print() and println()


        // this:

//        System.out.println("Hello");
//        System.out.println("World");

        // is equivalent to this:
//        System.out.print("Hello ");
//        System.out.print("Hello ");
//        System.out.print("Hello ");
//        System.out.print("Hello ");
//        System.out.print("World");



        // to concatenate, just like JS:

//        String name = "Justin";
//        String lastName = "Reich";
//        String greeting = "Howdy";
//        String puctuation = "!";
//        System.out.println(greeting + " " + name + " " + lastName + puctuation);

//        System.out.printf("%s %s %s%s", greeting, name, lastName, puctuation);




        // ================================== printf()




        // Print a formatted string using the following... printf(formatString, data)

        // same output as print():

//        System.out.printf("Hello");
//        System.out.printf("World");


        // creating a string variable:

//        String bigBall = "World";
//        System.out.printf("Hello %s", bigBall);


        // multiple variables:



        // ================================== USER INPUT

//        String name = "Justin";


        // .next() captures each input separated by a string:


//        System.out.println("Welcome!");
//        System.out.println("Please enter your name: ");
//        String userName = sc.next();
//        System.out.println("Well hello, " + userName);
//        System.out.println("What is the breed of your pet dog??");
//        String breed = sc.next();
//        System.out.println("Your dog is a..." + breed);









        // .nextInt() captures the first valid int value:

//        Scanner sc = new Scanner(System.in);
//        System.out.println("How old are you?");
//        double age = sc.nextDouble();
//        System.out.println("You are " + age);
//

        // .nextLine();

//        System.out.println("What is you favorite James Bond movie?");
//        String answer = sc.nextLine();
//        System.out.println("I like " + answer + " too!");



        // Quirk of using next() then nextLine()...
        // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo

                Scanner sc = new Scanner(System.in);
                System.out.print("Please enter your favorite number: ");
                int num = sc.nextInt();
                System.out.println(num);
                sc.nextLine();
                System.out.print("Please enter your favorite words: ");
                String words = sc.nextLine();
                System.out.println(words);

    }

}
