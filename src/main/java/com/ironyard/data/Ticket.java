package com.ironyard.data;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by jasonskipper on 1/19/17.
 */
public class Ticket {
    private final static int MAX = 53;
    private final static int MIN = 1;

    private ArrayList<Integer> numbers = new ArrayList<Integer>();

    /**
     * Constructor creates a new ticket with random
     * and unique values
     */
    public Ticket() {

        for (int i = 0; i < 6; i++) {
            int tmp = 0;
            do{
                tmp = generateRandomTicketNumber();
            }while(numbers.contains(tmp));

            // i know tmp has a unique value
            numbers.add(tmp);
        }
    }

    /**
     * Constructor allows user to specify exact numbers of ticket
     * @param one
     * @param two
     * @param three
     * @param four
     * @param five
     * @param six
     */
    public Ticket(int one, int two, int three, int four, int five, int six){
        numbers.add(one);
        numbers.add(two);
        numbers.add(three);
        numbers.add(four);
        numbers.add(five);
        numbers.add(six);
        
    }

    /**
     * Constructor allows user to specify exact numbers of ticket via ArralList
     * @param myNumbers
     */
    public Ticket(ArrayList<Integer> myNumbers) throws Exception {
        if(myNumbers.size()!=6){
            throw new Exception("Exactly 6 numbers should be sent to new Ticket");
        }
        numbers.addAll(myNumbers);
    }

    private int generateRandomTicketNumber() {
        Random r = new Random();
        int got = r.nextInt((Ticket.MAX - Ticket.MIN) + 1) + Ticket.MIN;
        return got;
    }

    public String toString() {
        String display = "<strong>";
        for (int i = 0; i < numbers.size(); i++) {
            display = display + String.format("%02d", numbers.get(i)) + "  ";
        }
        display = display + "</strong>";
        return display;
    }
}



