package com.ironyard.data;

import java.util.Random;

/**
 * Created by jasonskipper on 1/19/17.
 */
public class Ticket {
    private final static int MAX = 53;
    private final static int MIN = 1;

    private int pick1;
    private int pick2;
    private int pick3;
    private int pick4;
    private int pick5;
    private int pick6;

    public Ticket(){
        // no problem, can't be duplicate
        pick1 = generateRandomTicketNumber();

        do {
            pick2 = generateRandomTicketNumber();
        }while(pick1 == pick2);

        do{
            pick3 = generateRandomTicketNumber();
        }while(pick3 == pick2 || pick3 == pick1);

        do{
            pick4 = generateRandomTicketNumber();
        }while(pick4 == pick1 ||pick4 == pick2 || pick4 == pick3);


        do{
            pick5 = generateRandomTicketNumber();
        }while(pick5 == pick1 ||pick5 == pick2 || pick5 == pick3|| pick5 == pick4);

        do{
            pick6 = generateRandomTicketNumber();
        }while(pick6 == pick1 ||pick6 == pick2 || pick6 == pick3|| pick6 == pick4|| pick6 == pick5);

    }

    private int generateRandomTicketNumber(){
        Random r = new Random();
        int got = r.nextInt((Ticket.MAX - Ticket.MIN) + 1) + Ticket.MIN;
        System.out.println("Gen:"+got);
        return got;
    }

    public String toString(){
        return "<strong>"+String.format ("%02d", pick1)+"  "+String.format ("%02d", pick2)+"  "+String.format ("%02d", pick3)+"  "+String.format ("%02d", pick4)+"  "+String.format ("%02d", pick5)+"  "+String.format ("%02d", pick6)+"</strong>";
    }

}
