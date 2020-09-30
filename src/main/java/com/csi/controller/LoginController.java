package com.csi.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 步骤一：继承HTTPServlet
 * 步骤2：需要根据不同的请求重写对应doxxx方法
 * 步骤3：注册servlet信息
 */
public class LoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username=req.getParameter("username");
        String password=req.getParameter("password");

        if ("admin".equals(username) && "admin".equals(password)){

            //获取session
            HttpSession session=req.getSession();
            session.setAttribute("username",username);

            req.getRequestDispatcher("welcome.jsp").forward(req,resp);
        }else {
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out=resp.getWriter();
            out.println("<script>alert('出现错误')</script>");
            req.getRequestDispatcher("login.jsp").forward(req,resp);

        }


    }
}
