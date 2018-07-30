import util.Input;

public class PersonTest {

    public static void main(String[] args) {

        Input input = new Input();

        System.out.println(input.getString());
        System.out.println(input.getString("GIVE ME SOMETHING!"));
        System.out.println(input.yesNo());


        Person human = new Person();
        human.setName("fer");
        human.sayHello();

        Person employee = new Person();
        employee.setName("Phillip");
        employee.sayHello();

    }

}
