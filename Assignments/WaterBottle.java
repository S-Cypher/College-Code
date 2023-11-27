public class WaterBottle extends Container {
    private String brand;
    private double capacity;
    private boolean insulated;
    
    String container = getContainer();
    String color = getColor();
    String material = getMaterial();
    boolean filled = getFilled(); 
    String filledWith = getFilledWith();

    public WaterBottle() {     
        this.container = "Water bottle";
        this.capacity = 22; //ounces
        this.brand = "Igloo";
        this.insulated = true; 
        this.material = "Stainless steel";

        
    }

    public WaterBottle(String color, String material, boolean filled, String filledWith, double capacity, String brand, boolean insulated) {
        super(color, material, filled, filledWith);
        this.container = "Water bottle";
        this.capacity = capacity;
        this.brand = brand;
        this.insulated = insulated;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setInsulated(boolean insulated) {
        this.insulated = insulated;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setFilledWith(String filledWith) {
        this.filledWith = filledWith;
    }

    
    public String toString() {
        return "Container type: " + container + "\nColor: " + color + "\nMaterial: " + material + "\nFilled: " + filled  + "\nFilled with: " + filledWith + "\nCapacity: "+ capacity+ " oz" + "\nBrand: " + brand + "\nInsulated: " + insulated + "\n";
    }
}
