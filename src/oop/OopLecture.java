package oop;

public class OopLecture {

    public static void main(String[] args) {

//        Person p1 = new Person();
//        p1.firstName = "Bob";
//        p1.lastName = "Bobberson";
//
//        Person p2 = new Person();
//        p2.firstName = "Sally";
//        p2.lastName = "Sanders";
//
//        System.out.println(p1.sayHello());
//        System.out.println(p2.sayHello());

        Dog d = new Dog("Sparky", "Pug", true, 3);
//        public String name;
//        public String breed;
//        public final String animalType = "Canine";
//        public boolean canBreed;
//        public int age;
//        d.name = "Sparky";
//        d.breed = "Pug";
//        d.canBreed = true;
//        d.age = 3;

//        System.out.println(d.name);

        Student s = new Student("Ron", 98);
        s.setGrade(90);
        s.setName("Ronald");
        System.out.println(s.getName());
        System.out.println(s.getGrade());

//        Student s2 = new Student("Justin", "Lassen");
//        System.out.println(s2.name);
//        System.out.println(s2.cohort);

    }

}
