package Controller;

import java.io.*;
import java.util.List;

import Model.Etudiant;
import Model.ImpEtudiant;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class indexServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ImpEtudiant impEtudiant = new ImpEtudiant();
        String adress ;
        System.out.println(request.getParameter("fname"));
        List <Etudiant> etu =impEtudiant.getByFname(request.getParameter("fname"));
        if(etu ==null){
            adress = "NotFound.jsp";
        }
        else {
            adress = "Home.jsp";
        }
        request.setAttribute("etudiant",etu);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(adress);
        requestDispatcher.forward(request,response);
    }

    public void destroy() {
    }
}