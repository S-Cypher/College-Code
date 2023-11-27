public class FerrisWheel extends Ride implements ChildFriendly {
    String name = getName();

    public FerrisWheel() {

    }

    public FerrisWheel(String name) {
        super(name);

    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + ":"+ " Our ferris wheel fit for the whole family!";
    }
    
}

/*
 Ferris Wheel name ideas for each park:
 Celestial Circle
 Enchanted Wheel
 The Rockin' Rim

 */
