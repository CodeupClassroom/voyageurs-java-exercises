public class Person {

    // Class variable
    private String name;
    // Shared with all the subclass
    protected String lastName;

    public Person(){
        
    }

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello I'm "+ this.name);
    }

}
