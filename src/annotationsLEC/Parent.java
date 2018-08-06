package annotationsLEC;

public class Parent {

    public void sy() {
        System.out.println("I am the parent!");
    }

    public void newMethod() {
        System.out.println("New way of doing things...");
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("Old way of doing things...");
    }


    public static void main(String[] args) {
        Parent p = new Parent();
        p.oldMethod();
    }

}
