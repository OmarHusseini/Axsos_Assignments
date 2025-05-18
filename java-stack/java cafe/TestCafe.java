
import java.util.ArrayList;

public class TestCafe {

    public static void main(String[] args) {
        CafeUtil first = new CafeUtil();
        // first.getStreakGoal();//55
        System.out.println(first.getStreakGoal(20));

        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n", first.getOrderTotal(lineItems));

        System.out.println("----- Display Menu Test-----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        first.displayMenu(menu);

        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            first.addCustomer(customers);
            System.out.println("\n");

        }

    }

}
