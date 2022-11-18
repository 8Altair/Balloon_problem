package org.Task;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class RequestCall
{
    HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8001), 0);

    server.createContext("/test", new void MyHttpHandler());

    server.setExecutor(java.util.concurrent.Executor.newCachedThreadPool());
    server.start();
    logger.info(" Server started on port 8001");
}
