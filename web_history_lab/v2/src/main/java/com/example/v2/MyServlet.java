package com.example.v2;

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

        // 1. 요청 받기
        // localhost:8080/hello.do?cmd=a
        String cmd = req.getParameter("cmd");
        System.out.println(req.getQueryString()); // cmd=a
        System.out.println(cmd); // a

        // 2. 요청 받은 논문 찾기
        String html = """
                <h1>${data} 논문입니다</h1>
                """;

        // Route (길 안내자)
        if (cmd.equals("a")) {
            html = html.replace("${data}", "a");
        } else if (cmd.equals("b")) {
            html = html.replace("${data}", "b");
        } else {
            html = "<h1>찾는 문서가 없습니다.</h1>";
        }

        // 3. 응답 해주기
        resp.setHeader("Content-Type", "text/html; charset=utf-8");
        PrintWriter pw = resp.getWriter(); // buffered writer이다
        pw.println(html);

    }
}
