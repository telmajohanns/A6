package is.hi.hbv202g.ass6;

public class CarOwner {
    private String theName;

    public Car theOwnedCar;


    CarOwner(String name, Car ownedCar) {
        theName = name;
        theOwnedCar = ownedCar;
    }

    String getName() {
        return theName;
    }

}
