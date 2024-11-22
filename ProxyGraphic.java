package work3;

/**
 * Proxy class to control access to GraphicElement.
 */
public class ProxyGraphic implements Displayable {
    private GraphicElement realElement;
    private int x, y, width, height;
    private String color, name;

    public ProxyGraphic(int x, int y, int width, int height, String color, String name) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.name = name;
    }

    @Override
    public void display() {
        if (realElement == null) {
            realElement = new GraphicElement(x, y, width, height, color, name);
        }
        realElement.display();
    }
}
