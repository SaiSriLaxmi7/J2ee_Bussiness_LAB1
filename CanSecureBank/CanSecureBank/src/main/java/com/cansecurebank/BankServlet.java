package com.cansecurebank;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/bank")
public class BankServlet extends HttpServlet {
    private double mockBalance = 1000.0;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String message = "";

        if ("deposit".equals(action)) {
            double amount = Double.parseDouble(request.getParameter("amount"));
            mockBalance += amount;
            message = "Deposited $" + amount + ". New balance: $" + mockBalance;
        } else if ("balance".equals(action)) {
            message = "Current balance: $" + mockBalance;
        }

        request.setAttribute("message", message);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}