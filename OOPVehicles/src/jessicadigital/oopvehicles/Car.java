package jessicadigital.oopvehicles;

/**
 * This class defines a Car as a basic type of vehicle.
 * @author admin2
 */
public class Car extends Vehicle {
    private Colour colour;
    public Car(Colour colour) {
        this.colour = colour;
        this.passengers = 4;
        this.wheels = 4;
    }
    public String toString() {
        return super.toString()+"\n  Colour: "+this.colour;
    }
}
