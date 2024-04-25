public class Sofa implements Shipping {
    private double distanceInKM;

    public Sofa(double distanceInKM) {
        this.distanceInKM = distanceInKM;
    }

    public double getDistanceInKM() {
        return distanceInKM;
    }

    public void setDistanceInKM(double distanceInKM) {
        this.distanceInKM = distanceInKM;
    }

    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
        
    }
    
}
