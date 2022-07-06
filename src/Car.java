public class Car {

    private int wheels;
    private ColorEnum colorOfCar;
    private Factory factory;

    public Car(int wheels,ColorEnum colorOfCar, Factory factory) {
        this.wheels = wheels;
        this.colorOfCar = colorOfCar;
        this.factory = factory;
    }

    public int getWheels() {
        return wheels;
    }

    public ColorEnum getColorOfCar() {
        return colorOfCar;
    }

    public Factory getFactory() {
        return factory;
    }

    public String getInfo() {
        return "The number of wheels: " + getWheels() +
                "\nColor of car: " + getColorOfCar() +
                "\nFactory is situated in " + factory.getCountry() +
                "\nFactory made " + factory.getQuantityOfVehiclesProduced() + " cars";
    }
}
