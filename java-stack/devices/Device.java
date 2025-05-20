public class Device{

private int bettary=100;


    public int getBettary() {
        return bettary;
    }

    public void setBettary(int bettary) {
        if(bettary>100){
            this.bettary=100;
        }
        else if(bettary<0){
            this.bettary=0;
        }
        else{
            this.bettary = bettary;
            }

        if(this.bettary<=10){
            System.out.println("bettary falls below 10");
        }        
    }

    public void status(){
        System.out.println("Battey Remaining:"+getBettary());
    }

}
