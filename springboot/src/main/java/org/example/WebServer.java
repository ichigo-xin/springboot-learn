package org.example;

import org.springframework.web.context.WebApplicationContext;

/**
 * @author : ichigo-xin
 * @date 2023/8/16
 */
public interface WebServer {

    void start(WebApplicationContext applicationContext);
}
