
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

        Employee one = new Employee();
        Employee mmgr = new Manager();

        Employee[] employees = new Employee[2];

        employees[0] = one;
        employees[1] = mmgr;

        for (Employee emp: employees){
            emp.doWork();
        }


    }
}
