public class Phone extends Device{
    
    public void makeCall(){
        System.out.println("Your make a call");
        setBettary(getBettary()-5);
        status();        


   }

    public void playGame(){
        if(getBettary()<=25){
            System.out.println("Dont play game");
            return;
        }
        
        System.out.println("Your Play Game");
        setBettary(getBettary()-20);
        status();

   }

    public void charge(){
        System.out.println("Your Charged");
        setBettary(getBettary()+50);
        status();
   }

}


