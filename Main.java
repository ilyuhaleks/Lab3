package work3;

public class Main {
    public static void main(String[] args) {
        // Creating individual graphic elements and a proxy
        GraphicElement element1 = new GraphicElement(10, 20, 100, 50, "blue", "Rectangle");
        ProxyGraphic proxyElement = new ProxyGraphic(15, 25, 120, 60, "green", "ProxyRectangle");

        // Creating a composite group and adding elements
        CompositeGraphicGroup group = new CompositeGraphicGroup();
        group.addElement(element1);
        group.addElement(proxyElement);

        // Displaying elements in the group
        System.out.println("Displaying composite group:");
        group.display();

        // Removing an element and displaying the group again
        group.removeElement(proxyElement);
        System.out.println("After removing proxy element:");
        group.display();
    }
}
