public class MiniGolf extends Attraction implements ChildFriendly {
    String name = getName();

    MiniGolf() {

    }

    MiniGolf(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + ": Putt your way to victory at our challenging and fun mini-golf course!";
    }

    //Melodic Meadows
    //Wizard's Whimsy
    //Starship Putters

}
