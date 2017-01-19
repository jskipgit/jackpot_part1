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



    public int getPick1() {
        return pick1;
    }

    public void setPick1(int pick1) {
        this.pick1 = pick1;
    }

    public int getPick2() {
        return pick2;
    }

    public void setPick2(int pick2) {
        this.pick2 = pick2;
    }

    public int getPick3() {
        return pick3;
    }

    public void setPick3(int pick3) {
        this.pick3 = pick3;
    }

    public int getPick4() {
        return pick4;
    }

    public void setPick4(int pick4) {
        this.pick4 = pick4;
    }

    public int getPick5() {
        return pick5;
    }

    public void setPick5(int pick5) {
        this.pick5 = pick5;
    }

    public int getPick6() {
        return pick6;
    }

    public void setPick6(int pick6) {
        this.pick6 = pick6;
    }
}
