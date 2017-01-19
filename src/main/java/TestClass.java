import java.util.Random;

/**
 * Created by jasonskipper on 1/19/17.
 */
public class TestClass {
    public static void main(String[] args){
        int max = 15;
        int min = 1;

        Random r = new Random();
        int range = (max - min) + 1;

        int random = r.nextInt(range);
        int finalRandom = random + min;
        System.out.println(finalRandom);
        String test = String.format ("%02d", finalRandom);
        System.out.println(test);
    }
}
