class IceCream extends FoodStall implements ChildFriendly {
    String name = getName();

    IceCream() {

    }

    IceCream(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + ": Cool off here with our creamy and delicious treats!";
    }
}

//Celestial Sundaes
//Mystic Treats
//Melody's Scoops & Swirls