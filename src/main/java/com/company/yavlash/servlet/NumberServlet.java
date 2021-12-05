package com.company.yavlash.servlet;

import com.company.yavlash.service.NumberService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class NumberServlet extends HttpServlet {
    NumberService service = new NumberService();

    public NumberServlet() {
    }

    @Override
    public void init() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("numbers", service.putNumbersInList());
        getServletContext().getRequestDispatcher("/unordered.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("numbers", service.putNumbersInList());
        request.setAttribute("sortedNumbers", service.sortList());
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/ordered.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    public void destroy() {
    }
}