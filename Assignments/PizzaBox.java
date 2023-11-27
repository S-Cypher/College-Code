public class PizzaBox extends Container {
    private int totalSlices;
    private int slicesLeft;
    private String size;
    
    String container = getContainer();
    String color = getColor();
    boolean filled = getFilled();
    String filledWith = getFilledWith();
    String material = getMaterial();

    public PizzaBox() {
        this.container = "Pizza box";
        this.totalSlices = 10;
        this.slicesLeft = 10; //full box! :)
        this.size = "Medium";
        this.material = "Cardboard";
        this.filled = true;
        this.filledWith = "Pizza";

    }

    public PizzaBox(String color, String material, boolean filled, String filledWith, int totalSlices, int slicesLeft, String size) {
        super(color, material, filled, filledWith);
        this.container = "Pizza box";
        this.totalSlices = totalSlices;
        this.slicesLeft = slicesLeft;
        this.size = size;

    } 

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setTotalSlices(int totalSlices) {
        this.totalSlices = totalSlices;
    }

    public void setSlicesLeft(int slicesLeft) {
        this.slicesLeft = slicesLeft;
    }

    public String toString() {
        return super.toString() + "\nSize: " + size+ "\nTotal slices: " + totalSlices + "\nSlices left: " + slicesLeft + "\n";
    }


    
}
