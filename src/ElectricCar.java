public class ElectricCar extends Car {

    private int battery;
    private Boolean autoPilot;

    public ElectricCar(int wheels, ColorEnum colorOfCar, Factory factory, int battery, Boolean autoPilot) {
        super(wheels, colorOfCar,factory);
        this.battery = battery;
        this.autoPilot = autoPilot;
    }


    public int getBattery() {
        return battery;
    }

    public Boolean getAutoPilot() {
        return autoPilot;
    }

    public void turnAutoPilot(Boolean autoPilot) {
        this.autoPilot = autoPilot;
        if (autoPilot != false) {
            System.out.println("AutoPilot is on");
        } else {
            System.out.println("AutoPilot is off");
        }
    }

    public void turnAutoPilot(Boolean autoPilot, int battery) {
        this.autoPilot = autoPilot;
        this.battery = battery;
        if (autoPilot != false && battery > 0) {
            System.out.println("AutoPilot is on");
        } else {
            System.out.println("AutoPilot is off");
        }
    }
    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nCharge of battery: " + getBattery() +
                "\n" + getAutoPilot();
    }

}
