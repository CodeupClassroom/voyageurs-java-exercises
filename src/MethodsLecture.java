import java.util.Scanner;

public class MethodsLecture {

    // Class variables
    static String name = "fer";

    public static void main(String[] args) {

        System.out.println(name + "'s CLI app");

        count();
        count(6);

        eatCereal();

        boolean res = isOne(1);
        System.out.println(res);

        System.out.println(isOne(2));
        System.out.println(isOne(5));
        System.out.println("---------");
        System.out.println(isOne("6"));
        System.out.println(isOne("1"));

    }

//    I care about the return result
    public static boolean isOne(int number){
        return false;
//        return number == 1;
    }

    // Method overloading
    public static boolean isOne(String numberAsString){
        return numberAsString.equals("1");
    }

//    I don't care care about the result, actions
    public static void eatCereal(){
        System.out.println("Get a bowl");
        System.out.println("Pour the milk");
        System.out.println("Add cereal");
        System.out.println("Use a spoon");
        System.out.println(name+" eats cereal");
    }

    public static void count(){
        for(int i = 5; i > 0; i--){
            System.out.println(i);
        }
    }

    public static void count(int n){
// When it's finished
        if(n <= 0){
            System.out.println("Done");
            return;
        }
        System.out.println(n);
        count(n-1);
    }



}