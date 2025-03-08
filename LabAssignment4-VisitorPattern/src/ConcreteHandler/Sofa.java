package ConcreteHandler;

import Interface.Furniture;
import Interface.ShippingCostVisitor;

public class Sofa implements Furniture{
    private int size;
    private int capacity;

    public Sofa(int size, int capacity) {
        this.size = size;
        this.capacity = capacity;
    }


    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visit(this);
    }

    public String sofaDetails() {
        return "Sofa: " +  " Size " +  size + ", Capacity: " + capacity;
    }
}



