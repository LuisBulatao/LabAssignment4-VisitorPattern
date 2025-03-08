package ConcreteHandler;

import Interface.Furniture;
import Interface.ShippingCostVisitor;

public class Television implements Furniture {
    private int size;
    private String brand;

    public Television(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visit(this);
    }
    public String tvDetails() {
        return "Television: " + " Size " + size + " inches, Brand: " + brand;
    }
}
