package some.directory;

public class Lamp implements ElectricityConsumer {

    public void lightOn() {
        System.out.println("light on");
    }


    @Override
    public void electricityOn() {
        lightOn();
    }

}
