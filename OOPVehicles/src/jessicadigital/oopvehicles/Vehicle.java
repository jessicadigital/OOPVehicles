package jessicadigital.oopvehicles;

/**
 * This class defines a Vehicle of any type.
 * @author jessicadigital
 */
public abstract class Vehicle { 
    /**
     * These will be set by the child classes to define the properties of this
     * vehicle.
     */
    protected int passengers;
    protected int wheels;
    
    /**
     * Does this vehicle allow passengers?
     * @return True if the vehicle can carry passengers
     */
    public boolean hasPassengers() {
        return this.passengers > 0;
    }
    
    /**
     * Does this vehicle have wheels?
     * @return True if the vehicle has wheels
     */
    public boolean hasWheels() {
        return this.wheels > 0;
    }
    
    /**
     * Make the vehicle move
     */
    public void move() {
        
    }
    
    /**
     * Override the default String representation of this object to print the
     * Vehicle information.
     * @return Vehicle type
     */
    @Override
    public String toString() {
        return "Vehicle type: " + this.getClass().getName() + "\n  Passengers: "+this.passengers+"\n  Wheels: "+this.wheels;
    }
}