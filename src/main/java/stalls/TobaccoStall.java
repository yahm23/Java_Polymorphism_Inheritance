package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }


    public boolean isAllowedToVisit(Visitor visitor) {
        if (visitor.getAge() < 18) {
            return false;
        } else {
            return true;
        }


    }
}
