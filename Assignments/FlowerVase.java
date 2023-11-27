public class FlowerVase extends Container {
    private String shape;
    private String flowers;
    
    String container = getContainer();
    String color = getColor();
    String material = getMaterial();
    boolean filled = getFilled(); 
    String filledWith = getFilledWith();


    public FlowerVase() {
        this.shape = "Cylinder";
        this.flowers = "Roses";
        this.container = "Flower vase";
        this.material = "Glass";
        //default values
        //not sure if we are supposed to have these but they help me check the toString method for any missing fields

    }

    public FlowerVase(String color, String material, boolean filled, String filledWith, String shape, String flowers) {
        super(color, material, filled, filledWith);
        this.shape = shape;
        this.flowers = flowers;
        this.container = "Flower vase";
        this.material = material;
        
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFlowers(String flowers) {
        this.flowers = flowers;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setFilledWith(String filledWith) {
        this.filledWith = filledWith;
    }

    public String toString() {
        return super.toString() + "\nShape: " + shape + "\nFlower type: " + flowers + "\n";
    }
}
