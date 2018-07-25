import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("Write something");
        Scanner input = new Scanner(System.in);
        String msg = input.nextLine().trim();
        String uppercaseVer = msg.toUpperCase();

        if(msg.endsWith("?")){
            System.out.println("Sure");
        } else if (msg.endsWith("!") || (uppercaseVer.equals(msg) && !msg.isEmpty() ) ){
            System.out.println("Whoa, chill out!");
        } else if ( msg.isEmpty() ){
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever");
        }

    }
}