package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * HttpServlet => Socket 서버에 http 프로토콜이 적용된 클래스
 */

@WebServlet("/what.k")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloWorld");
        resp.setHeader("Content-Type", "text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Goodbye</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post ~~~");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Post</h1>");
    }

}
