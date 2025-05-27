import java.util.Random;

public class PuzzleJava{

    public static  int [] getTenRolls(){
        int [] result = new int[10];
        Random rand= new Random();
        for(int i= 0 ; i<result.length;i++ ){
            result[i]= rand.nextInt(1,21);
        }
        return result;

    }

    public static String getRandomLetter(){
        return String.valueOf((char)('a'+new Random().nextInt(0,25)));
    }

    public static String generatePassword(){
        String pass="";
        for (int i =0; i<9;i++){
          pass+=  getRandomLetter();
        }
        return pass;

    }

    public String[] getNewPasswordSet(int length){
        String [] newpass= new String[length];
        for(int i=0 ; i <length;i++){
            newpass[i]=generatePassword();
        }
        return newpass; 
    }


}