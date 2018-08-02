package abstractLEC;

public class MacBook implements PowerControllable {
    @Override
    public void powerOn() {
        System.out.println("Open and and push the on button");
    }

    @Override
    public void powerOff() {
        System.out.println("Push the off button and close");
    }
}
