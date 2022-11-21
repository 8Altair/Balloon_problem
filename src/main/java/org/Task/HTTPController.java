package org.Task;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HTTPController extends HttpServlet
{
    private int result;

    public void init() throws ServletException
    {
        // Do required initialization
        result = Solution.solution("BALLOON", "BAOOLLNNOLOLGBAX");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        // Set response content type
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h1>" + result + "</h1>");
    }

    public void destructor() {}
}