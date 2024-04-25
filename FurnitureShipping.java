import java.util.ArrayList;
import java.util.List;

public class FurnitureShipping {
    public static void main(String[] args) {
        List<Shipping> furniture = new ArrayList<>();

        furniture.add(new Chair());
        furniture.add(new Sofa(3.4));
        furniture.add(new Table(6.7));

        ShippingVisitor visitor = new ShippingCalculatorCost();

        for (Shipping item : furniture) {
            item.accept(visitor);
        }
    }
}
