
import java.util.Arrays;

public class TestpuzzleJava {
    
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        int [] randomRolls = generator.getTenRolls();
        System.out.println(randomRolls[0]);

        System.out.println(generator.getRandomLetter());
        System.out.println(generator.generatePassword());
        // System.out.println(generator.getNewPasswordSet(4).Array.toString(newpass));
        System.out.println(Arrays.toString(generator.getNewPasswordSet(4)));

       
                //..
        // Write your other test cases here.
        //..
    }
}