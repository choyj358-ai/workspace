package com.example.action;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI(); // localhost:8080/a.do
        System.out.println(uri); // /a.do

        // a
        String cmd = uri.substring(
                uri.lastIndexOf("/") + 1,
                uri.lastIndexOf("."));

        // DB에서 조회한 데이터
        String a = "a논문입니다";
        String b = "b논문입니다";
        String c = "c논문입니다";

        String data = "";

        if (cmd.equals("a")) {
            data = a;
        } else if (cmd.equals("b")) {
            data = b;
        } else if (cmd.equals("c")) {
            data = c;
        } else {
            data = "논문을 찾을 수 없습니다";
        }

        String html = """
                <html>
                <body>
                <h1>${data}</h1>
                </body>
                </html>
                """.replace("${data}", data);

        resp.setContentType("text/html; charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println(html);
    }

}
