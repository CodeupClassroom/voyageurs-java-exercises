import util.Input;

public class PersonTest {

    public static void main(String[] args) {

//        Input class tests

//        Input input = new Input();
//
//        System.out.println(input.getString());
//        System.out.println(input.getString("GIVE ME SOMETHING!"));
//        System.out.println(input.yesNo());

//        System.out.println(input.getInt());
//        System.out.println(input.getInt(1,5));

//        System.out.println(input.getDouble());
//        System.out.println(input.getDouble(1.25,2.55));


        Person human = new Person();
        human.setName("fer");
        human.sayHello();

        Person employee = new Person();
        employee.setName("Phillip");
        employee.sayHello();

    }

}
