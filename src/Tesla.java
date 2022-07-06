public final class Tesla extends ElectricCar {

    private String model;
    private int speed;

    public Tesla(int wheels, ColorEnum colorOfCar,Factory factory, int battery, Boolean autoPilot, String model, int speed) {
        super(wheels, colorOfCar, factory, battery, autoPilot);
        this.model = model;
        this.speed = speed;

    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nModel: " + getModel() +
                "\nSpeed: " + getSpeed() + "\n";
    }
}
