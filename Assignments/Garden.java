public class Garden extends Attraction {
    String name = getName();

    Garden() {

    }

    Garden(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + ": Take a relaxing walk through our garden filled with themed flower beds and topiary sculptures!";
    }
}