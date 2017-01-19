package com.ironyard.servlet;

import com.ironyard.data.Ticket;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by jasonskipper on 1/19/17.
 */
@WebServlet(name = "TicketServlet", urlPatterns = "/generate")
public class TicketServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     * This will handle the case where a user is looking to generate a random new ticket
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // create a ticket
        Ticket aTicket = new Ticket();

        // look for the list
        ArrayList<Ticket> myTicketList = (ArrayList<Ticket>) request.getSession().getAttribute("tList");

        // if not there, this is 1st time so create it and put into session (for next time)
        if(myTicketList == null){
            myTicketList = new ArrayList<Ticket>();
            request.getSession().setAttribute("tList", myTicketList);
        }

        // add ticket to list
        myTicketList.add(aTicket);

        // send to JSP page to display tickets
        String nextJSP = "/index.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);
    }
}
