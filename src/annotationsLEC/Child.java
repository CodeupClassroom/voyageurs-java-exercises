package annotationsLEC;

import java.util.ArrayList;
import java.util.List;

public class Child extends Parent {

    @Override
    public void sy() {
        System.out.println("I am the child!");
    }

    // Suppress warnings example
    @SuppressWarnings("all")
    public List<String> doRiskyThings() {
//        int blah;
        int divideByZero = 10/0;
        String hello = (String) "hello";
        return new ArrayList();
    }


    public static void main(String[] args) {
        Child c = new Child();
        c.doRiskyThings();
    }

}
