

public class Sculpture extends Art {

    String material;

    public Sculpture(String title,String author,String description,String material){
        super(title, author, description);
        this.material=material;
    }

    

    public void viwdArt(){
        
        System.out.println("The title is: "+ this.title);
        System.out.println("The author is: "+ this.author);
        System.out.println("About: "+ this.description);
        System.out.println("The Painttype: "+ this.material);

    }


    
}