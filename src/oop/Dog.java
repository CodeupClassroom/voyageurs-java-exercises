package oop;

public class Dog {

    public String name;
    public String breed;
    public static final String ANIMAL_TYPE = "Canine";
    public boolean canBreed;
    public int age;


    //    "Sparky", "Pug", true, 3
    public Dog(String name, String breed, boolean canBreed, int age) {
        this.name = name;
        this.breed = breed;
        this.canBreed = canBreed;
        this.age = age;
    }

    public void callDog(String name) {
        if (name.equalsIgnoreCase(this.name)) {
            System.out.println(this.name + " is walking toward you...");
        } else {
            System.out.println(this.name + " ignores you.");
        }
    }



    public static double humanToDogYears(double years) {
        return years * 7;
    }


}
