package lz.test.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    public static final Logger logger = LoggerFactory.getLogger(HelloServlet.class);

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter outer = resp.getWriter();
        String hiStr = "hi, siyu";
        logger.info(hiStr);
        outer.println(hiStr);
        outer.close();
    }
}
