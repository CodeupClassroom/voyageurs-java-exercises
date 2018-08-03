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
        boolean willContinue = true;
        do {
            String choice = input.getString("What student would you like to see more information on?");

            //


            System.out.println("Will you continue?");
            willContinue = input.yesNo();
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
        s1.addGrade(100);
        s1.addGrade(80);
        s1.addGrade(100);

        Student s2 = new Student("Fred");
        s2.addGrade(80);
        s2.addGrade(100);
        s2.addGrade(80);
        s2.addGrade(100);

        Student s3 = new Student("Bob");
        s3.addGrade(80);
        s3.addGrade(100);
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

