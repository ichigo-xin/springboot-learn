package org.example;

import org.springframework.web.context.WebApplicationContext;

/**
 * @author : ichigo-xin
 * @date 2023/8/16
 */
public class JettyWebServer implements WebServer{
    @Override
    public void start(WebApplicationContext applicationContext) {
        System.out.println("启动Jetty");
    }
}
