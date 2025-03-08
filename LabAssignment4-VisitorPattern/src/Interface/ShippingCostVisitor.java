package Interface;

import ConcreteHandler.Sofa;
import ConcreteHandler.Table;
import ConcreteHandler.Television;

public interface ShippingCostVisitor {
    void visit(Television television);
    void visit(Table table);
    void visit(Sofa sofa);

}
