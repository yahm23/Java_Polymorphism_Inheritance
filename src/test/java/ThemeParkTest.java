import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.ParkingSpot;
import stalls.Stall;
import stalls.TobaccoStall;
import static org.junit.Assert.*;


import java.util.ArrayList;

public class ThemeParkTest {
    Dodgems dodgems;

    Visitor visitor;
    Visitor visitor2;

    TobaccoStall baccyLand;
    ThemePark yoloLand;

    @Before
    public void setup(){
        dodgems = new Dodgems("Bumper Cars", 5);

        visitor = new Visitor(14, 2.1, 40.0);
        visitor2 = new Visitor(11, 1.2, 40.0);
        baccyLand = new TobaccoStall("Bacco4Kidz","Jon", ParkingSpot.A2);


        yoloLand = new ThemePark("YOLO-Land");

        yoloLand.addIReviewedObject(dodgems);
        yoloLand.addIReviewedObject(baccyLand);



    }

    @Test

    public void canGetAllReviewed(){
        assertEquals(2,yoloLand.getAllReviewed().size());

    }




}
