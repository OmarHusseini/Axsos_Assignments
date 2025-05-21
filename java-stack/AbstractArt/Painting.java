

public class Painting extends Art{
    String paintType;

    public Painting(String title,String author,String description,String paintType){
        super(title, author, description);
        this.paintType=paintType;
        
    }
    public void viwdArt(){
        System.out.println("The title is: "+ this.title);
        System.out.println("The author is: "+ this.author);
        System.out.println("About: "+ this.description);
        System.out.println("The Painttype: "+ this.paintType);

        
    }


}
