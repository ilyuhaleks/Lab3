package work3;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphicGroup implements Displayable {
    private List<Displayable> elements = new ArrayList<>();

    public void addElement(Displayable element) {
        elements.add(element);
    }

    public void removeElement(Displayable element) {
        elements.remove(element);
    }

    @Override
    public void display() {
        System.out.println("Composite Group Display:");
        for (Displayable element : elements) {
            element.display();
        }
    }
}

