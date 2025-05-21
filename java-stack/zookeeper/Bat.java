public class Bat extends Mamman{

    public Bat(){
        setEnergy(300);
    }
    
    public void fly(){
        System.out.println("Bat is airborne");
        setEnergy(getEnergy()-50);
        status();
    }
    public void eatHumans(){
        System.out.println("bat's eaten");
        setEnergy(getEnergy()+25);
        status();
    }   

    public void attackTown(){
        System.out.println("Bat's attack");
        setEnergy(getEnergy()-100);
        status();
    }   



}