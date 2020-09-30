package com.csi.test;

import com.csi.controller.product.StudentListController;
import com.csi.dao.StudentDao;
import com.csi.dao.impl.StudentDaoImpl;
import com.csi.domain.Student;
import com.csi.service.StudentService;
import com.csi.service.impl.StudentServiceImpl;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {


        StudentService ss=new StudentServiceImpl();
        /*List<Student> students=ss.list();
        System.out.println(students);*/

        ss.delete("S1001");



    }
}
