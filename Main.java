public class Main {
    public static void main(String[] args) {
        
        // e. Create an instance of class Sedan in its main method.
        Sedan mySedan = new Sedan("Toyota Camry", "Silver");

        System.out.println("--- Testing Sedan Actions ---");
        
        // Demonstrate method OVERRIDING (calls the standard no-parameter version)
        mySedan.accelerate(); 
        
        // Demonstrate method OVERLOADING (calls the version that takes an integer)
        mySedan.accelerate(120); 

        // Testing the other methods just to be sure it works
        mySedan.stop();
        mySedan.gas();
        mySedan.turnOnRadio();
        mySedan.openTrunk();
    }
}