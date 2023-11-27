public class Pizza extends FoodStall implements ChildFriendly {
    String name = getName();

    Pizza() {

    }

    Pizza(String name) {
        super(name); 
    }

    public String toString() {
        return name + ": Bring the whole family and have a pizza party with our delicious pies!";
    }

}
//Music City Pies
//Milky Way Pizza
//Enchanting Pizza Co.

