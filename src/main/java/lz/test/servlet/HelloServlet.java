package lz.test.servlet;

import lz.test.service.HelloWorldService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by liuzheng on 16/4/19.
 */
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter outer = resp.getWriter();
        outer.println("I love siyu.");

        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        HelloWorldService helloService = (HelloWorldService) context.getBean("HelloWorldConsumer");
        outer.println(helloService.sayHello("siyu"));
        outer.close();
    }
}
