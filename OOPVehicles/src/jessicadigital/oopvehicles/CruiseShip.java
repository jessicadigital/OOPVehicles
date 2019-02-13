package jessicadigital.oopvehicles;

public class CruiseShip extends Boat {
    private String name;
    private String place;
    public CruiseShip(String name, int passengers, String place) {
        this.name = name;
        this.passengers = passengers;
        this.place = place;
    }
    public String toString() {
        return super.toString()+"\n  Name: "+this.name+"\n  Place: "+this.place;
    }
}
