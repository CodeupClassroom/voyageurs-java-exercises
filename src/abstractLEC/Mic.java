package abstractLEC;

public class Mic implements PowerControllable {
    @Override
    public void powerOn() {
        System.out.println("Flip the switch to on");
    }

    @Override
    public void powerOff() {
        System.out.println("Flip the switch to off");
    }
}
