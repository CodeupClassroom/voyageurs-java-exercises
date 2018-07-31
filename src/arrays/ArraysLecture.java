package arrays;

import java.util.Arrays;

public class ArraysLecture {

    public static void main(String[] args) {

        // slide 3 (Arrays)

//        String[] instructors = new String[5];
//        instructors[0] = "Justin";
//        instructors[1] = "Fer";
//        instructors[2] = "Daniel";
//        instructors[3] = "Ryan";


//        String[] instructors = {"Justin", "Fer", "Daniel", "Ryan", "Zach"};
//
//        System.out.println(instructors[3]);
//

//

//        int[] numbers = new int[3];
//        numbers[0] = 1;
//
//        System.out.println(numbers[1]);


//        final int NUMBER_OF_BEATLES = 4;
//        BandMember[] theBeatles = new BandMember[NUMBER_OF_BEATLES];
//
//        theBeatles[0] = new BandMember("John");
//        theBeatles[1] = new BandMember("Paul");
//        theBeatles[2] = new BandMember("George");
//        theBeatles[3] = new BandMember("Ringo");






        // slide 4 (Elements)





        // slide 5 (Iterating)


            // regular for loop
//            String[] languages = {"html", "css", "javascript", "java"};
//            for (int i = 0; i < languages.length; i++) {
//                System.out.println(languages[i]);
//            }
//
//            // enhanced for loop
//            for (String language : languages) {
//                System.out.println(language);
//            }



            // additional enhanced for loop example


        // slide 6 and 7 (The Arrays Class)

            String[] testArray = new String[4];
//            // - fills all or a range of elements with a given value
            Arrays.fill(testArray, "Badgers");

//             Arrays.toString(testArray); // - prints out a copy of the array contents

//                String arrayAsAString = Arrays.toString(testArray);
//                System.out.println(arrayAsAString);


             // Arrays.equals(array1, array2) - returns true if two array elements are equal and in the same order

//                String[] words = {"Mushroom", "Mushroom"};
//                String[] words2 = {"Mushroom", "Mushroom"};
//                System.out.println(Arrays.equals(words, words2));

            // Arrays.copyOf(array, length) - returns a copy array of a given array of a given length

//                String[] twoBadgers = Arrays.copyOf(testArray, 2);
//                System.out.println(Arrays.toString(twoBadgers));
//                System.out.println(twoBadgers);


            // Arrays.sort(array, startIndex, toIndex) - sorts array elements alphabetically/numerically 2nd and 3rd arguments are optional.

//            String[] meme = {"Badgers", "Mushroom", "Badgers", "Snake"};
//
//            System.out.println(Arrays.toString(meme));
//            Arrays.sort(meme); // this does change the original
//            System.out.println(Arrays.toString(meme));
//            System.out.println();

            // Arrays.binarySearch(array, value) - returns the index of a value if in the array or -1 if not found
              // Array MUST be sorted before using binarySearch() to return a valid index.

//            String[] meme = {"Badgers", "Mushroom", "Badgers", "Snake", "Bob"};
//            Arrays.sort(meme);
////
//            System.out.println(Arrays.binarySearch(meme,"fox"));
////            System.out.println(Arrays.binarySearch(meme, "Mushroom"));


        // slide 8 (Two-Dimensional Arrays)

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(matrix[2][1]);


        for (int[] row : matrix) {
            System.out.println("+---+---+---+");
            System.out.print("| ");
            for (int n : row) {
                System.out.print(n + " | ");
            }
            System.out.println();
        }
        System.out.println("+---+---+---+");



    }

}
