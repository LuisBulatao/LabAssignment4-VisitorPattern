    package Calculator;

    import ConcreteHandler.Sofa;
    import ConcreteHandler.Table;
    import ConcreteHandler.Television;
    import Interface.ShippingCostVisitor;
    public class ShippingCostCalculator implements ShippingCostVisitor{
        double totalCost ;

        public double getTotalCost() {
            return totalCost;
        }
        @Override
        public void visit(Television television) {
            totalCost += television.getSize() * 2.0;
        }

        @Override
        public void visit(Table table) {
            totalCost += table.getSize() * 1.5 + table.getSeaters() * 5.0;
        }

        @Override
        public void visit(Sofa sofa) {
            totalCost += sofa.getSize() * 3.0 + sofa.getCapacity() * 4.0;
        }
    }