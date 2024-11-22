package work3;

/**
 * Class representing a simple graphic element.
 */
public class GraphicElement implements Displayable {
    private int x, y, width, height;
    private String color, name;

    public GraphicElement(int x, int y, int width, int height, String color, String name) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.name = name;
    }

    @Override
    public void
    display() {
        System.out.println("GraphicElement: " + name + ", Color: " + color +
                ", Position: (" + x + ", " + y + "), Size: " + width + "x" + height);
    }
}
