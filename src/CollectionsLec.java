import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLec {

    public static void main(String[] args) {

//        int size = 8;
//        int[] numbers = new int[size];
//        System.out.println(numbers[9]);
//        System.out.println("Hello");
//        numbers.length;

//        ArrayList<Integer> numbers2 = new ArrayList<>();
//        numbers2.add(20);
//        numbers2.add(0, 21);
//        numbers2.add(22);
//
//
//        System.out.println(numbers2.size());
//
//        int indexOf = numbers2.indexOf(20);
//        System.out.println("index: "+ indexOf +"  value: " +numbers2.get(indexOf));
//
//        System.out.println(numbers2.contains(20));
//        numbers2.add(20);
//
//        System.out.println(numbers2);
//
//        int lindexof = numbers2.lastIndexOf(20);
//        numbers2.remove(lindexof);
//
//        System.out.println(numbers2);
//
//        for(int i = 0;i< numbers2.size();i++){
//            System.out.println(numbers2.get(i));
//        }
//
//        ArrayList<String> roasts = new ArrayList<>();
//        roasts.add("light");
//        roasts.add("medium");
//        roasts.add("medium");
//        roasts.add("dark");
//
//        System.out.println(roasts.contains("dark"));
//        System.out.println(roasts.contains("espresso"));
//
//        System.out.println(roasts.isEmpty());
//
//        roasts.remove("espresso");
//        System.out.println(roasts.lastIndexOf("medium"));
//        roasts.remove("medium");
//        System.out.println(roasts.lastIndexOf("medium"));
//
//        roasts.remove(2);
//
//        System.out.println(roasts);

        HashMap<String, String> usernames = new HashMap<>();

        usernames.put("Ryan", "ryanorsinger");
        usernames.put("Zach", "zgulde");
        usernames.put("Fernando", "fmendozaro");
        usernames.put("Justin", "jreich5");

        System.out.println("Fer's uername: "+usernames.get("Fernando"));

        System.out.println(usernames.getOrDefault("Jason", "Instructor not found"));

        System.out.println(usernames.containsKey("Justin"));
        System.out.println(usernames.containsValue("fmendozaro"));


        usernames.putIfAbsent("daniel", "jreich5");
        System.out.println(usernames);

        System.out.println(usernames.values());
        System.out.println(usernames.keySet());

        for (String name: usernames.keySet()) {
            System.out.println("Email: " + name + "@codeup.com");
        }

        for (String github: usernames.values()) {
            System.out.println("github.com/user/"+github);
        }


//         Crazy examples with objects

        CodeupStudent student1 = new CodeupStudent(101, "Roxana", "2018", 100);
        CodeupStudent student2 = new CodeupStudent(102, "Marc", "2018", 0);
        CodeupStudent student3 = new CodeupStudent(103, "Lexy", "2017", 80);

        HashMap<Integer, CodeupStudent> students = new HashMap<>();

        students.putIfAbsent(student1.getId(), student1);
        students.putIfAbsent(student2.getId(), student2);
        students.putIfAbsent(student3.getId(), student3);
        students.putIfAbsent(student3.getId() + 1, new CodeupStudent(104, "Fer", "2019", 99.99));

        double sum = 0;

        // Get the avg of grades
        for (CodeupStudent student : students.values()) {
            sum += student.getGrade();
            System.out.println(student.getName() + " " );
        }

        System.out.println(sum / students.size());


    }
}
