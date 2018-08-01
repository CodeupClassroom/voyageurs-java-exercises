public class SuperHero extends Person {

    private String alterEgo;

    public SuperHero(String name, String alterEgo){
        // Only persons with a name could exist
        super(name);
        this.alterEgo = alterEgo;
    }

    // Replace the normal process of the getName
    @Override
    public String getName(){
        return this.alterEgo;
    }

    // Use the original definition of getName -> Person
    public String getSecretID(){
        return super.getName();
    }

}
