public class Motorcycle extends Vehicle {

    public Motorcycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void accelerate() {
        System.out.println("The motorcycle accelerates very quickly.");
    }

    @Override
    public void stop() {
        System.out.println("The motorcycle squeezes the hand brake to stop.");
    }

    @Override
    public void gas() {
        System.out.println("The motorcycle fills its small tank with premium gas.");
    }
}