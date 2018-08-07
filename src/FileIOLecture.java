import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIOLecture {

    public static void main(String[] args) {

        // ============================ PATH

        Path fileLecturePath = Paths.get("src/lec", "FileIOLecture.java");

//    System.out.println(fileLecturePath);
//    System.out.println(fileLecturePath.toAbsolutePath());
//
//    Path otherPath = Paths.get("src", "../", "src", "../", "src", "FileIOLecture");
//    System.out.println(otherPath);
//    System.out.println(otherPath.normalize());
//    System.out.println(otherPath.normalize().toAbsolutePath());
//    System.out.println(otherPath.toAbsolutePath());

        // ============================ FILE METHODS

//            System.out.println(Files.exists(fileLecturePath));
//            System.out.println(Files.exists(Paths.get("bob.txt")));

//            String directory = "data";
//            String filename = "info.txt";
//            Path dataDirectory = Paths.get(directory);
//            Path dataFile = Paths.get(directory, filename);
//
//            if (!Files.isDirectory(dataDirectory)) {
//                try {
//                    Files.createDirectories(dataDirectory);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            if (!Files.exists(dataFile)) {
//                try {
//                    Files.createFile(dataFile);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }


        // ============================ READING FILES

//        try {
//            List<String> contents = Files.readAllLines(
//                    Paths.get("data", "bob.txt")
//            );
//        } catch (Exception e) {
//            System.out.println("Exception!");
//            e.printStackTrace();
//        }

//            try {
//                List<String> contents = Files.readAllLines(Paths.get("data/info.txt"));
//                System.out.println(contents.toString());
//            } catch (IOException e) {
//                System.out.println("Exception!");
//                e.printStackTrace();
//            }


        // ============================ WRITING FILES

//            Path p = Paths.get("./src/lec",  "test.txt");
//
//            List<String> names = new ArrayList<>();
//            names.add("Tim");
//            names.add("Sally");
//            names.add("Mary");
//            try {
//                Files.write(p, names, StandardOpenOption.APPEND);
//            } catch(IOException e) {
//                e.printStackTrace();
//            }
//
//            String directory = "data";
//            String filename = "info.txt";
//            Path dataDirectory = Paths.get(directory);
//            Path dataFile = Paths.get(directory, filename);
//
//            List<String> nums = new ArrayList<>();
//            nums.add("1");
//            nums.add("2");
//            nums.add("3");
//
//            try {
//                Files.write(dataFile, nums, StandardOpenOption.APPEND);
//            } catch(IOException e) {
//                System.out.println("Exception!!!");
//                e.printStackTrace();
//            }

        // ============================ ADDITIONAL SLIDE EXAMPLES


        // Print out each line in an existing file, along with the line number

//        Path groceriesPath = Paths.get("data", "groceries.txt");
//        List<String> groceryList = null;
//        try {
//            groceryList = Files.readAllLines(groceriesPath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        for (int i = 0; i < groceryList.size(); i += 1) {
//            System.out.println((i + 1) + ": " + groceryList.get(i));
//        }


        // Add a line to an existing file

//        try {
//            Files.write(
//                Paths.get("data", "groceries.txt"),
//                Arrays.asList("eggs"), // list with one item
//                StandardOpenOption.APPEND
//            );
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Replace "milk" with "cream"

//        List<String> lines = null;
//        try {
//            lines = Files.readAllLines(Paths.get("data", "groceries.txt"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        List<String> newList = new ArrayList<>();
//        for (String line : lines) {
//            if (line.equals("milk")) {
//                newList.add("cream");
//                continue;
//            }
//            newList.add(line);
//        }
//
//        try {
//            Files.write(Paths.get("data", "groceries.txt"), newList);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
