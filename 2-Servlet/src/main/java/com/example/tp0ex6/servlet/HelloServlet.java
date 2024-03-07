package com.example.tp0ex6.servlet;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/")
public class HelloServlet extends HttpServlet {
    private ArrayList<Element> allElements = new ArrayList<>();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String title = request.getParameter("titre");
        String description = request.getParameter("description");

        if (title != null && description != null) {
            Element item = new Element();
            item.setTitle(title);
            item.setDescription(description);
            allElements.add(item);
        }
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Form and Elements</title></head>");
        out.println("<body>");
        out.println("<h1>FORM</h1>");
        out.println("<form method=\"get\" action=\"\">");
        out.println("<input type=\"text\" name=\"titre\" placeholder=\"Title\"><br>");
        out.println("<textarea name=\"description\" placeholder=\"Description\"></textarea><br>");
        out.println("<input type=\"submit\" value=\"Submit\">");
        out.println("</form>");

        out.println("<h2>Elements</h2>");
        if (!allElements.isEmpty()) {
            for (Element element : allElements) {
                out.println("<p>Title: " + element.getTitle() + "</p>");
                out.println("<p>Description: " + element.getDescription() + "</p>");
                out.println("<hr>");
            }
        } else {
            out.println("<p>No elements submitted yet.</p>");
        }
        out.println("</body>");
        out.println("</html>");
    }
}
