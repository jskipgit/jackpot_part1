package com.ironyard.data;

import java.util.Random;

/**
 * Created by jasonskipper on 1/19/17.
 */
public class Ticket {
    private final static int MAX = 53;
    private final static int MIN = 1;

    private int[] numbers = new int[6];

    /**
     * Constructor creates a new ticket with random
     * and unique values
     */
    public Ticket() {

        for (int i = 0; i < numbers.length; i++) {
            boolean isUnque;
            int tmp = 0;
            do{
                isUnque = true;
                tmp = generateRandomTicketNumber();
                for(int x:numbers){
                    if(tmp == x){
                        isUnque = false;
                    }
                }
            }while(!isUnque);

            // i know tmp has a unique value
            numbers[i] = tmp;
        }
    }

    private int generateRandomTicketNumber() {
        Random r = new Random();
        int got = r.nextInt((Ticket.MAX - Ticket.MIN) + 1) + Ticket.MIN;
        return got;
    }

    public String toString() {
        String display = "<strong>";
        for (int i = 0; i < numbers.length; i++) {
            display = display + String.format("%02d", numbers[i]) + "  ";
        }
        display = display + "</strong>";
        return display;
    }
}



