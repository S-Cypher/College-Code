public class Container {
    private String color;
    private String material;
    private boolean filled;
    private String container;
    private String filledWith;
    
    
    public Container() {
        this.material = "Nothing";
        this.color = "white";
        this.filled = false;
        this.container = "A simple container, nothing special.";
        this.filledWith = "Air";
        //default values??

    }
    
    public Container(String color, String material, boolean filled, String filledWith) {
        this.color = color;
        this.material = material;
        this.filled = filled;
        this.filledWith = filledWith;
    }


    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean fill) {
        this.filled = fill;
    }

    public String getFilledWith() {
        return filledWith;
    }

    public void setFilledWith(String filledWith) {
        this.filledWith = filledWith;
    }

    public String toString() {
        return "Container type: "+ container + "\nColor: " + color + "\nMaterial: " + material + "\nFilled: " + filled + "\nFilled with: " + filledWith;
        //such a long return statement...
    }

}

