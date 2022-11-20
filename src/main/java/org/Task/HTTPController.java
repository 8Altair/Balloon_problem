package org.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Enumeration;

public class HTTPController
{
    Enumeration<String> headerNames = request.getHeaderNames();
    while(headerNames.hasMoreElements())
    {
        String headerName = headerNames.nextElement();
        System.out.println("Header Name - " + headerName + ", Value - " + request.getHeader(headerName));
    }
}
