public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready ";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double latte = 5.5;
        double cappuccino = 7;
        int hotchoclate = 20;

    
        // Customer name variables (add yours below)
        String customer1 = "Shatha";
        String customer2 = "Adam";
        String customer3 = "Saly ";
        String customer4 = "Saeed";

        

        
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

        
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        //System.out.println(generalGreeting + customer1 + " "+customer2); // Displays "Welcome to Cafe Java, Shatha"
        // ** Your customer interaction print statements will go here ** //
        if (isReadyOrder3){

            System.out.println(customer3 +readyMessage );
        }
        else{
            System.out.println(customer3 + pendingMessage);
        }

        if(isReadyOrder4){
            System.out.println(displayTotalMessage + cappuccino);
        }
        else{
            System.out.println(customer4 + pendingMessage);            
        }

        if(isReadyOrder3){
            System.out.println(displayTotalMessage + (latte + latte));
        }
        else{
            System.out.println(customer3 + pendingMessage);            
        }
        
        System.out.println(displayTotalMessage + (hotchoclate -  latte));
        

    
    } 
}