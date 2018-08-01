public class PolymorphTest {

    public static void main(String[] args) {
        Person person = new Person();
        Employee ferObj = new Employee();

        ferObj.setName("Fer");
        System.out.println(ferObj.getName());
        ferObj.sayHello();
        ferObj.doWork();

        person.setName("Ana");
        System.out.println(person.getName());
        person.sayHello();

        SuperHero batman = new SuperHero("Bruce W", "Batman");
        System.out.println(batman.getName());
        System.out.println(batman.getSecretID());



    }
}
