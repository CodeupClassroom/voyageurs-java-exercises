public class SyntaxLecture {

    public static void main(String[] args) {

//        Primitive types built in with the lang
        byte rating = 1;
        short aztec = 3435;
        int aTTarena = 3455435;
        long alamodome = 21474836483333L;
        float price = 34.56f;
        double grade = 89.23;

//         Reference types
        Long anotherVenue = 2342343242334L;
        String name = "Fer\'s first name";

        System.out.println("price = " + price);
        System.out.println("grade = " + grade);

        char initialFN = 'f';
        char gender = 'c';

//      Declaration
        boolean doYouHaveQuestions;
//      Initialization
        doYouHaveQuestions = true;

        String cohort = "voyageurs";
        name = "Nando";

        System.out.println("Name: " + name);

        final int PAGES = 10;

        System.out.println("pages = " + PAGES);

        rating += 125;

        System.out.println("rating = " + rating);
        System.out.println( 10 / price);

//        Casting

//        Implicit
        double morePrecise = aTTarena;
        System.out.println("aTTarena = " + aTTarena);
        System.out.println("morePrecise = " + morePrecise);

//        Explicit
        final double pi = 3.1416;
        int almostPi = (int) pi;

        float populationThatLikesVanilla = 80.34f;
        byte chartVanilla = (byte) populationThatLikesVanilla;

        System.out.println(pi);
        System.out.println(almostPi);

    }

}
