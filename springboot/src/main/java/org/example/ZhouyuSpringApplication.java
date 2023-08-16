package org.example;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.util.Map;

public class ZhouyuSpringApplication {

    public static void run(Class clazz) {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(clazz);
        applicationContext.refresh();

        WebServer webServer = getWebServer(applicationContext);
        webServer.start(applicationContext);
    }

    private static WebServer getWebServer(AnnotationConfigWebApplicationContext applicationContext) {

        Map<String, WebServer> webServers = applicationContext.getBeansOfType(WebServer.class);
        if (webServers.isEmpty()) {
            throw new NullPointerException();
        } else if (webServers.size() > 1) {
            throw new IllegalArgumentException();
        }
        return webServers.values().stream().findFirst().get();
    }



}