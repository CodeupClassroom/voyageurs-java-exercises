package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {

        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();

        while(true){

            System.out.println("What would you like to do?");

            System.out.println("0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category");

            switch (input.getInt(0, 5)){
                case 0:
                    System.out.println("Bye");
                    System.exit(0);
                    break;
                case 1:
                    for(Movie movie: movies){
                        printMovie(movie);
                    }
                    break;
                case 2:
                    for (Movie movie: movies) {
                        if(movie.getCategory().equals("animated")){
                            printMovie(movie);
                        }
                    }
            }

        }


    }

    public static void printMovie(Movie movie){
        System.out.println("Title: "+ movie.getName() + " category: " + movie.getCategory());
    }

}
