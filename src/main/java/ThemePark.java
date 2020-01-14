import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    private String name;

    private ArrayList<IReviewed> allStuff;

    public ThemePark(String name){
        this.name = name;
        allStuff = new ArrayList<>();

    }

    public void addIReviewedObject(IReviewed thing){
        this.allStuff.add(thing);

    }

    public ArrayList<IReviewed> getAllReviewed(){
        return this.allStuff;
    }

}
