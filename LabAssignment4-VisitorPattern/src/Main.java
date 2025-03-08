import Calculator.ShippingCostCalculator;
import ConcreteHandler.*;


public class Main {
    public static void main(String[] args) {
        Television tv = new Television(50, "Sony");
        Table table = new Table(6, 4);
        Sofa sofa = new Sofa(8, 3);

        System.out.println(tv.tvDetails());
        System.out.println(table.tableDetails());
        System.out.println(sofa.sofaDetails());

        ShippingCostCalculator calculator = new ShippingCostCalculator();

        tv.accept(calculator);
        table.accept(calculator);
        sofa.accept(calculator);

        System.out.println("Total Shipping Cost: " + calculator.getTotalCost());
    }
}
