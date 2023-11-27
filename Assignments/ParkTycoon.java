public class ParkTycoon {
    public static void main(String[] args) {

        //Harmony Heights music themed
        AmusementPark heights = new AmusementPark("Harmony Heights");

        LazyRiver river = new LazyRiver("Serene Soundstream");
        RollerCoaster scream = new RollerCoaster("Symphony of Screams");

        IceCream sweet = new IceCream("Melody's Scoops & Swirls");
        Pizza pie = new Pizza("Music City Pizza Pies");

        Garden notes = new Garden("Chorus Garden");
        Museum history = new Museum("Melodies of the Universe Museum");

        heights.addRides(river);
        heights.addRides(scream);

        heights.addFood(pie);
        heights.addFood(sweet);

        heights.addAttract(notes);
        heights.addAttract(history);

        System.out.println(heights);
        System.out.println("Rides: ");
        for (Ride e: heights.rides) {
            System.out.println(e);
        }

        System.out.println("\nFood stalls: ");
        for(FoodStall y: heights.foodstall) {
            System.out.println(y);
        }

        System.out.println("\nAttractions: ");
        for(Attraction r: heights.attraction) {
            System.out.println(r);
        }

        System.out.println("\nYour children will especially love: ");

        for(ChildFriendly s: heights.safe) {
            System.out.println(s);
        }

        //Magiclandia magic and fantasy themed
        AmusementPark magic = new AmusementPark("Magiclandia Adventure Park");

        Museum natural = new Museum("History of the Supernatural");
        MiniGolf magic_putt = new MiniGolf("Wizard's Whimsy");

        HotDog eat = new HotDog("The Magic Meatery");
        IceCream starry = new IceCream("Mystic Treats");

        FerrisWheel enchant = new FerrisWheel("Enchanted Wheel");
        RollerCoaster mad = new RollerCoaster("Mystical Madness");

        magic.addAttract(natural);
        magic.addAttract(magic_putt);

        magic.addFood(eat);
        magic.addFood(starry);

        magic.addRides(enchant);
        magic.addRides(mad);

        System.out.println(magic);

        System.out.println("Rides: ");
        for (Ride e: magic.rides) {
            System.out.println(e);
        }

        System.out.println("\nFood stalls: ");
        for(FoodStall y: magic.foodstall) {
            System.out.println(y);
        }

        System.out.println("\nAttractions: ");
        for(Attraction r: magic.attraction) {
            System.out.println(r);
        }

        System.out.println("\nYour children will especially love: ");

        for(ChildFriendly s: magic.safe) {
            System.out.println(s);
        }



        //Cosmic Odyssey space themed
        AmusementPark space = new AmusementPark("Cosmic Odyssey Park");

        FerrisWheel  reach = new FerrisWheel("Celestial Circle");
        LazyRiver current = new LazyRiver("Cosmic Current");

        Pizza way = new Pizza("Milky Way Pizza");
        HotDog astro = new HotDog("AstroDog");

        Garden stellar = new Garden("Interstellar Greenery");
        MiniGolf ship = new MiniGolf("Starship Putters");

        space.addRides(reach);
        space.addRides(current);

        space.addFood(way);
        space.addFood(astro);

        space.addAttract(stellar);
        space.addAttract(ship);

        System.out.println(space);

        System.out.println("Rides: ");
        for (Ride e: space.rides) {
            System.out.println(e);
        }

        System.out.println("\nFood stalls: ");
        for(FoodStall y: space.foodstall) {
            System.out.println(y);
        }

        System.out.println("\nAttractions: ");
        for(Attraction r: space.attraction) {
            System.out.println(r);
        }

        System.out.println("\nYour children will especially love: ");

        for(ChildFriendly s: magic.safe) {
            System.out.println(s);
        }
    }
}