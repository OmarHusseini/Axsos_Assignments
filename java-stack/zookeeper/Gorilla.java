public class Gorilla extends Mamman{


public void throwSomething(){
    System.out.println("Ghorilla has thrown an object");
    setEnergy(getEnergy()-5);
    status();
}

public void eatBananas(){
    System.out.println("Ghorilla has eaten and increase");
    setEnergy(getEnergy()+10);
    status();
}

public void climb(){
    System.out.println("Ghorilla has climbed a tree ");
    setEnergy(getEnergy()-10);
    status();
}




}