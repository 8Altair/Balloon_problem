package org.Task;


import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.apache.commons.lang3.StringEscapeUtils;

import java.io.IOException;
import java.io.OutputStream;

public class HTTPRequest implements HttpHandler
{
    @Override
    public void handle(HttpExchange httpExchange) throws IOException
    {
        String requestParamValue=null;
        if("GET".equals(httpExchange.getRequestMethod()))
        {
            requestParamValue = handleGetRequest(httpExchange);
        }
        else if("POST".equals(httpExchange))
        {
            requestParamValue = handlePostRequest(httpExchange);
        }
        else if("PUT".equals((httpExchange.getRequestMethod())))
        {
            httpExchange.getRequestMethod();
            handlePutRequest(httpExchange);
            handleResponse(httpExchange, requestParamValue);
        }
    }

    private String handleGetRequest(HttpExchange httpExchange)
    {
        return httpExchange.getRequestURI()
                .toString()
                .split("\\?")[1]
                .split("=")[1];
    }

    private void handleResponse(HttpExchange httpExchange, String requestParamValue)  throws  IOException
    {
        OutputStream outputStream = httpExchange.getResponseBody();

        String htmlBuilder = "<html>" +
                "<body>" +
                "<h1>" +
                "Hello " +
                requestParamValue +
                "</h1>" +
                "</body>" +
                "</html>";

        // Encode HTML content
        String htmlResponse = StringEscapeUtils.escapeHtml4(htmlBuilder);

        httpExchange.sendResponseHeaders(200, htmlResponse.length());
        outputStream.write(htmlResponse.getBytes());
        outputStream.flush();
        outputStream.close();
    }
}
