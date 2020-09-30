package com.csi.service.impl;

import com.csi.dao.StudentDao;
import com.csi.dao.impl.StudentDaoImpl;
import com.csi.domain.Student;
import com.csi.service.StudentService;



import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> list() {

        StudentDao studentDao= (StudentDao) new StudentDaoImpl();
        List<Student> list=null;
        try {
            list=studentDao.list();
        } catch (SQLException e) {
            e.printStackTrace();
        }

       // System.out.println(list);
        return list;
    }

    //删除数据的方法
    @Override
    public void delete(String studentNO) {
        StudentDao studentDao= (StudentDao) new StudentDaoImpl();
        try {
            studentDao.delete(studentNO);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    //修改数据的方法
    @Override
    public void update(Student student) {
        StudentDao studentDao=new StudentDaoImpl();
        try {
            studentDao.update(student);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //根据id查找数据
    @Override
    public Student findById(String studentNO) {
        StudentDao studentDao=new StudentDaoImpl();
        Student student=null;

        try {
            student=studentDao.findById(studentNO);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

}
