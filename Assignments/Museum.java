public class Museum extends Attraction {
//making this reminds me of the Hall of Presidents at Disney World.
//I don't know too many kids who would have that as their favorite attraction
    String name = getName();

    Museum() {

    }

    Museum(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + ": Learn something new every time you visit our museum!";
    }

}
//History of Spaceflight in America
//History of the Supernatural 
