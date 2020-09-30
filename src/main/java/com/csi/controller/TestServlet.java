package com.csi.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("初始化！！！");
    }

    //先执行service，先进去
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("发送请求！！！！");
    }

    @Override
    public void destroy() {
        System.out.println("死亡了！！！！");
    }
}
