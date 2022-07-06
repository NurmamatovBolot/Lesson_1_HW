public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory("USA", 1000);
        ElectricCar electricCar = new ElectricCar(4, ColorEnum.BLACK, factory, 50, true);

        Tesla tesla = new Tesla(electricCar.getWheels(), ColorEnum.BLACK, factory, 70,
                electricCar.getAutoPilot(), "S", 255 );
        tesla.turnAutoPilot(tesla.getAutoPilot());
        System.out.println(tesla.getInfo());

        Tesla tesla2 = new Tesla(electricCar.getWheels(), ColorEnum.BLACK, factory, 68, electricCar.getAutoPilot(), "X", 300);
        tesla2.turnAutoPilot(tesla2.getAutoPilot());
        System.out.println(tesla2.getInfo());
    }
}