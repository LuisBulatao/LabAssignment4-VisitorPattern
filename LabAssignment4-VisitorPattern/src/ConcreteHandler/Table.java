package ConcreteHandler;

import Interface.Furniture;
import Interface.ShippingCostVisitor;

public class Table implements Furniture {
    private int size;
    private int seaters;

    public Table(int size, int seaters) {
        this.size = size;
        this.seaters = seaters;
    }


    public int getSize() {
        return size;
    }

    public int getSeaters() {
        return seaters;
    }

    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visit(this);
    }

    public String tableDetails() {
        return "Table: " +  " Size " + size + ", Seaters: " + seaters;
    }
}

