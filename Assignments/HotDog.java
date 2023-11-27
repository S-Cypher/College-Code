public class HotDog extends FoodStall {
    String name = getName();

    HotDog() {

    }

    HotDog(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + ": Our hot dogs are so good, you'll want to take a break from the rides just to enjoy them!";
    }
}

//AstroDog or Stellar Sausages
//The Rhapsody Dog
//The Magic Meatery
