public class SportsCar extends Vehicle implements Automobile {

    public SportsCar(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void accelerate() {
        System.out.println("The Sports Car launches from 0 to 60 in 3 seconds!");
    }

    @Override
    public void stop() {
        System.out.println("The Sports Car uses carbon ceramic brakes to stop instantly.");
    }

    @Override
    public void gas() {
        System.out.println("The Sports Car requires high-octane racing fuel.");
    }

    @Override
    public void turnOnRadio() {
        System.out.println("Sports Car radio is drowned out by the engine noise.");
    }

    @Override
    public void openTrunk() {
        System.out.println("Sports Car trunk opens (there is barely enough space for a backpack).");
    }
}