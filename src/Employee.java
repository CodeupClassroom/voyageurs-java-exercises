

public class Employee extends Person {

    public void doWork(){
        System.out.println("I'm working");
    }

    @Override
    public void sayHello() {
        System.out.println("How can i help you?");
    }
}
