public class LazyRiver extends Ride implements ChildFriendly {
    private String name;

    LazyRiver() {
        
    }

    LazyRiver(String name) {
        this.name = name;
    }
    
    public String toString() {
        return name + ": Relax your cares away and take in the gentle waves of our lazy river ";
    }


}

/*
 Name ideas for each park:
    Wizard's Waterway
    Cosmic Current
    Serene Soundstream
 */
