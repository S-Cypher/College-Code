import java.util.ArrayList;

public class AmusementPark {
    private String parkName;

    ArrayList<Ride> rides = new ArrayList<>(); //array list of type Ride
    ArrayList<FoodStall> foodstall = new ArrayList<>();
    ArrayList<Attraction> attraction = new ArrayList<>();
    ArrayList<ChildFriendly> safe = new ArrayList<>(); //child friendly

    public AmusementPark() {

    }

    public AmusementPark(String parkName) {
        this.parkName = parkName;
    }

    public void addRides(Ride ride) {
        if ((ride instanceof Ride) && (ride instanceof ChildFriendly)) {
            rides.add(ride);
            safe.add((ChildFriendly)ride); //thank god for casting
        }

        else if (ride instanceof Ride) {
            rides.add(ride);
        }
    }

    public void addFood(FoodStall food) {
        if ((food instanceof FoodStall) && (food instanceof ChildFriendly)) {
            foodstall.add(food);
            safe.add((ChildFriendly)food);
        }

        else if (food instanceof FoodStall) {
            foodstall.add(food);
        }
    }

    public void addAttract(Attraction attract) {
        if((attract instanceof Attraction) && (attract instanceof ChildFriendly)) {
            attraction.add(attract);
            safe.add((ChildFriendly)attract);
        }
        else if (attract instanceof Attraction) {
            attraction.add(attract);
        }
    }



    public String toString() {
        return "\nWelcome to " + parkName + "!" +
        "\nPlease enjoy our rides, foodstalls, and extra attractions!\n"
        ;
    }

}

/*
could the arraylist in this file be used to store
all of the rides, food stalls, and attractions for the one park?


*/