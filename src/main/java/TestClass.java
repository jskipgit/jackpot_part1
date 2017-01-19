import com.ironyard.data.Ticket;

import java.util.ArrayList;
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

        Ticket randome = new Ticket();
        System.out.println("randome:"+randome);

        Ticket manualInts = new Ticket(1,2,3,4,5,6);

        System.out.println("manualInts:"+manualInts);
        ArrayList tmp = new ArrayList();
        tmp.add(5);
        tmp.add(6);
        tmp.add(7);
        tmp.add(4);
        tmp.add(5);
        try {
            Ticket arrayListTicket = new Ticket(tmp);
            System.out.println("array list:"+arrayListTicket);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
