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
        double classAverage = 0;

        do {

            while(true){

                String choice = input.getString("Provide a student's id or a command");

                if(choice.toUpperCase().equals("A")){
//                    Shows all the students, all the grades
                    for (String githubUsername: students.keySet()){
                        Student currentStudent = students.get(githubUsername);
                        System.out.println("\nName: "+ currentStudent.getName());
                        for (Integer grade: currentStudent.getGrades()) {
                            System.out.printf("Grade: %d\n", grade);
                        }
                        classAverage += currentStudent.getGradeAverage();
                    }

                    System.out.println("\nClass average grade: " + (classAverage / students.size()) );

                }else if(!students.containsKey(choice)){
                    System.out.println("Sorry, no student found with the gihub username of " + choice);
                } else {
//                    If the user key exists
                    System.out.printf("Name: %s - Gihub Username: %s\n" +
                            "Current Average: %f \n", students.get(choice).getName(), choice, students.get(choice).getGradeAverage());
                }
                System.out.println();
                System.out.println("Would you like to see another student?");
                if(!input.yesNo()){
                    break;
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
        output += "\n\n == Another cool commands: A - Shows all the students and all grades with a class average ==\n";
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

