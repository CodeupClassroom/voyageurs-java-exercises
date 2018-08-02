package abstractLEC;

public class Projector implements PowerControllable {

    public void projectorThings() {
        System.out.println("Stuff");
    }

    @Override
    public void powerOn() {
        System.out.println("Hit power button on remote");
    }

    @Override
    public void powerOff() {
        System.out.println("Hit power button on remote 2x");
    }
}
