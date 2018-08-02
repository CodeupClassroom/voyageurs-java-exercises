package abstractLEC;

public class AbstractLecture {

    public static void main(String[] args) {
        Employee ac = new Accountant();
        System.out.println(ac.work());

        PowerControllable mic = new Mic();
        PowerControllable macbook = new MacBook();
        PowerControllable projector = new Projector();
        PowerControllable[] devices = {mic, macbook, projector};

        setUpClassroom(devices);

    }

    public static void setUpClassroom(PowerControllable[] devices) {
        for (PowerControllable device : devices) {
            device.powerOn();
        }
    }

}
