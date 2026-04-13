public class Sedan extends Vehicle implements Automobile {

    public Sedan(String brand, String color) {
        super(brand, color);
    }

    // --- Methods from Vehicle ---
    @Override
    public void accelerate() {
        System.out.println("The Sedan accelerates smoothly.");
    }

    // OVERLOADED method for Part E
    public void accelerate(int targetSpeed) {
        System.out.println("The Sedan accelerates aggressively to " + targetSpeed + " km/h!");
    }

    @Override
    public void stop() {
        System.out.println("The Sedan applies standard brakes.");
    }

    @Override
    public void gas() {
        System.out.println("The Sedan fills up with unleaded petrol.");
    }

    // --- Methods from Automobile Interface ---
    @Override
    public void turnOnRadio() {
        System.out.println("Sedan radio is playing your favorite station.");
    }

    @Override
    public void openTrunk() {
        System.out.println("Sedan trunk pops open to load groceries.");
    }
}