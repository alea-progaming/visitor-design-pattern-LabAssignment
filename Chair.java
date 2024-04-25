public class Chair implements Shipping {

    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
        
    }
    
}
