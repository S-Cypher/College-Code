public class RollerCoaster extends Ride {
    String name = getName();

    public RollerCoaster() {

    }

    public RollerCoaster(String name) {
        super(name);
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return name + ": Explore thrilling heights and gravity defying twists and turns on our roller coaster!";
    }

    

}

/*
    Name ideas:
    Black Hole Blastoff / Galactic G-Force
    Symphony of Screams
    Mystical Madness

 */