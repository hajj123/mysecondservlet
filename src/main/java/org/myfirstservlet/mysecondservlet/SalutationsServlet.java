package org.myfirstservlet.mysecondservlet;

import java.io.*;  // Import for input/output operations

import jakarta.servlet.ServletException;  // Import for servlet functionality
import jakarta.servlet.http.*;  // Import for HTTP servlet classes
import jakarta.servlet.annotation.*;  // Import for servlet annotations

@WebServlet(urlPatterns = {"/salutations"})  // This annotation maps the servlet to the URL pattern "/salutations"
public class SalutationsServlet extends HttpServlet {  // Define a servlet class that extends HttpServlet

    public void service(HttpServletRequest request,  // Override the service method to handle incoming requests
                        HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");  // Set the response content type to HTML

        PrintWriter out = response.getWriter();  // Get a PrintWriter object to write the response

        // Retrieve the "nom" and "prenom" parameters from the request
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");

        // Generate the HTML output
        out.println("<html><body>");
        out.println("<h1>Exemple de résultat</h1>");
        out.println("Bonjour " + prenom + " " + nom);  // Include the personalized greeting
        out.println("</body></html>");
    }
}