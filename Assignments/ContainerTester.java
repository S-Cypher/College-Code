public class ContainerTester {
    public static void main(String[] args) {
        
        Container simple = new Container();
        Container complex = new Container("yellow", "plastic", true, "pencils");
        complex.setContainer("bag");
        complex.setColor("brown");
        System.out.println(simple);
        System.out.println(complex);
        

        
        FlowerVase rose = new FlowerVase();
        FlowerVase sunflower = new FlowerVase("brown", "glass", true, "water and flowers", "square", "Sunflowers");
        
        rose.setColor("purple");
        rose.setFilledWith("glass beads");
        rose.setFlowers("none");
        rose.setFilled(true);

        System.out.println(rose);
        System.out.println(sunflower);


        
        WaterBottle small = new WaterBottle();
        WaterBottle large = new WaterBottle("none", "plastic", true, "water", 16, "Kirkland", false);
        System.out.println(small);
        System.out.println(large);
        

        PizzaBox full = new PizzaBox();
        System.out.println(full);

    }
}

/*
 General notes:
    The no-arg constructors are made of default values from both the superclass and subclass
    Some of the default values in the no-arg constructors are based on objects that I found or something I came up with out of thin air
    Container type for the subclasses cannot be changed since the class name is the container type and it would be weird to do so
    
 
 Flower vase notes:
    I'm specifying a "flower vase", but usually vases can be filled
    with other things so I'm not sure if the class should have been named differently
    Shapes: apparently vases have specific names for their shapes like urn, amphora, gourd, baluster, etc.
 */