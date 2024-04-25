public class ShippingCalculatorCost implements ShippingVisitor {

    @Override
    public void visit(Chair chair) {
        double shippingCost = 500;
        System.out.println("Shipping cost for Chair Php " + shippingCost);
    }

    @Override
    public void visit(Table table) {
        double shippingCost = table.getDistanceInKM() * 650;
        System.out.println("Shipping cost for Chair Php " + shippingCost);
    }

    @Override
    public void visit(Sofa sofa) {
        double shippingCost = sofa.getDistanceInKM() * 800;
        System.out.println("Shipping cost for Chair Php " + shippingCost);
    }
    
}
