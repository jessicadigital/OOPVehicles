package jessicadigital.oopvehicles;

public class OOPVehicles {

    /**
     * This is the main function that is automatically executed when the Java
     * program is run.
     */
    public static void main(String[] args) {
        Van v = new Van(Colour.WHITE);
        System.out.println(v);
        
        Bicycle mountainbike = new Bicycle(BicycleType.MOUNTAINBIKE, 5);
        Bicycle roadbike = new Bicycle(BicycleType.ROADBIKE, 1);
        System.out.println(mountainbike);
        System.out.println(roadbike);
        
        CruiseShip cruiseship = new CruiseShip("QE2", 1777, "Southampton");
        System.out.println(cruiseship);
    }
    
}
