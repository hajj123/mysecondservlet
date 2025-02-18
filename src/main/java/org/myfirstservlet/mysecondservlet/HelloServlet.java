package org.myfirstservlet.mysecondservlet; // This line declares the package that the servlet belongs to

import java.io.*; // Importing the java.io package for input/output operations
import jakarta.servlet.http.*; // Importing the jakarta.servlet.http package for HTTP servlet classes
import jakarta.servlet.annotation.*; // Importing the jakarta.servlet.annotation package for servlet annotations

@WebServlet(name = "helloServlet", value = "/hello-servlet") // This annotation configures the servlet
public class HelloServlet extends HttpServlet { // This line defines a servlet class named HelloServlet
    private String message; // Declaring a private String variable named message

    public void init() { // Overriding the init() method to initialize the message variable
        message = "Hello World!"; // Assigning the string "Hello World!" to the message variable
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Overriding the doGet() method to handle GET requests

        response.setContentType("text/html"); // Setting the content type of the response to text/html

        // Hello
        PrintWriter out = response.getWriter(); // Creating a PrintWriter object to write the response content
        out.println("<html><body>"); // Writing the opening HTML tags to the response
        out.println("<h1>" + message + "</h1>"); // Writing the message within an h1 tag to the response
        out.println("</body></html>"); // Writing the closing HTML tags to the response
    }

    public void destroy() { // Overriding the destroy() method, which is currently empty
    }
}