import java.util.ArrayList;
public class CafeUtil{

    public int getStreakGoal(int numWeeks){

        int sum = 0;
        for(int i=0;i<=numWeeks;i++){
            sum +=i;
        }
        return sum;

    }

    public double getOrderTotal(double[]price){
        double total = 0.0 ;
        for (int i=0 ; i < price.length;i++){
            total += price [i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){

        for (int i = 0; i < menuItems.size(); i++){
        System.out.println(i+" "+menuItems.get(i));
        }

    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Enter Your Name Please");
        String username = System.console().readLine();
        System.out.println("HELLO" + username);
        System.out.println("There are"+ " " +customers.size()+ "people in front of you");
        customers.add(username);
        System.out.println(customers);




    }




}