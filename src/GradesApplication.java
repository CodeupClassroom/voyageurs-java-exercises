import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static Input input;

    public static void main(String[] args) {
        initApp();
    }

    public static void initApp() {

        HashMap<String, Student> students = populateData();
        System.out.println(returnWelcomeMessage(students));
        input = new Input();
        boolean willContinue;

        do {

            while(true){

                String choice = input.getString("What student would you like to see more information on?");

                if(!students.containsKey(choice)){
                    System.out.println("Sorry, no student found with the gihub username of " + choice);
                    System.out.println("Would you like to see another student?");

                    if(!input.yesNo()){
                        break;
                    }

                } else {
//                    If the user key exists
                    System.out.printf("Name: %s - Gihub Username: %s\n" +
                            "Current Average: %f \n", students.get(choice).getName(), choice, students.get(choice).getGradeAverage());
                }
            }

            System.out.println("Will you continue?");
            willContinue = input.yesNo();
            if(!willContinue){
                System.out.println("Goodbye, and have a wonderful day!");
            }
        } while(willContinue);


    }

    public static String returnWelcomeMessage(HashMap<String, Student> students) {
        String output = "";
        output += "Welcome!\n\n";
        output += "Here are the Github usernames of our students:\n\n";
        for (String key : students.keySet()) {
            output += "|" + key + "| ";
        }
        return output.trim();
    }

    public static HashMap<String, Student> populateData() {
        HashMap<String, Student> students = new HashMap<>();

        Student s1 = new Student("Sally");
        s1.addGrade(80);
        s1.addGrade(70);
        s1.addGrade(80);
        s1.addGrade(50);

        Student s2 = new Student("Fred");
        s2.addGrade(80);
        s2.addGrade(40);
        s2.addGrade(80);
        s2.addGrade(30);

        Student s3 = new Student("Bob");
        s3.addGrade(80);
        s3.addGrade(20);
        s3.addGrade(80);
        s3.addGrade(100);

        Student s4 = new Student("Jack");
        s4.addGrade(80);
        s4.addGrade(100);
        s4.addGrade(80);
        s4.addGrade(100);

        students.put("a123", s1);
        students.put("b123", s2);
        students.put("c123", s3);
        students.put("d123", s4);

        return students;
    }

}

