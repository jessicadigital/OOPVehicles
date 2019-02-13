package jessicadigital.oopvehicles;

public class Bicycle extends Vehicle {
    private BicycleType bicycletype;
    private int gears;
    public Bicycle(BicycleType bicycletype, int gears) {
        this.bicycletype = bicycletype;
        this.gears = gears;
        this.passengers = 0;
        this.wheels = 2;
    }
    public String toString() {
        return super.toString()+"\n  Bicycle type: "+this.bicycletype+"\n  Number of gears: "+this.gears;
    }
}
