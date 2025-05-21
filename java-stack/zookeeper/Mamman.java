public class Mamman{
    private int energy=100;

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void status(){
        System.out.println("The Energy is "+getEnergy());
    }
}