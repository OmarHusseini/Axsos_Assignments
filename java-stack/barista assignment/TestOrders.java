
public class TestOrders {

    public static void main(String[] args) {

        Order order1 = new Order("omar");
        Order order2 = new Order("arab");
        Order order3 = new Order("saif");
        Order order4 = new Order();
        Order order5 = new Order();

        Item item1 = new Item("mocha", 20);

        Item item2 = new Item("latte", 15);
        Item item3 = new Item("drip caffe", 10);
        Item item4 = new Item("cappucceno", 17);

        order1.addItem(item4);
        order2.addItem(item2);
        order3.addItem(item1);
        order2.addItem(item4);
        order1.addItem(item3);

        order1.getStatusMessage();

        System.out.println(order1.getOrderTotal());

        order2.displayMenu();

        //     // Use this example code to test various orders' updates
    }
}
