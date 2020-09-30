package com.csi.controller.product;

import com.csi.domain.Student;
import com.csi.service.StudentService;
import com.csi.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class StudentListController extends HttpServlet {

    //查询所有学生的信息
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StudentService studentService=new StudentServiceImpl();
        List<Student> list=studentService.list();
        req.setAttribute("list",list);
        System.out.println(list);

        req.getRequestDispatcher("list.jsp").forward(req,resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       // req.getAttribute();
        StudentService studentService=new StudentServiceImpl();

       // studentService.delete();
    }


}
