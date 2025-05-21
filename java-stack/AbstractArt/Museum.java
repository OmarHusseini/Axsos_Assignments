public class Museum {
    public static void main(String[] args) {

        Art starrynight=new Painting("The Starry Night","Vincent Van Gogh","The Starry Night, often called simply Starry Night, is an oil-on-canvas painting by the Dutch Post-Impressionist painter Vincent van Gogh. Painted in June 1889, it depicts the view from the east-facing window of his asylum room at Saint-Rémy-de-Provence, just before sunrise, with the addition of an imaginary village","oil");
        Art david=new Sculpture("David","Michelango","Dimensions	517 cm × 199 cm (17 ft × 6.5 ft) Location	Galleria dell'Accademia, Florence, Italy","Carrara marble");
        
        
        starrynight.viwdArt();
        System.out.println("-----------------------------------------------");
        System.out.println("Sculptur");
        david.viwdArt();
   
   
    }


}