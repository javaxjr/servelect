package com.csi.dao.impl;

import com.csi.dao.StudentDao;
import com.csi.domain.Student;
import com.csi.utils.JDBCUtils;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> list() throws SQLException {
        JDBCUtils jdbcUtils=new JDBCUtils();
        Connection connection=jdbcUtils.getConnection();
        String sql="SELECT * FROM student";
        PreparedStatement ps=connection.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();

        List<Student> students=new ArrayList<>();
        while (rs.next()){
            Student student=new Student();
            student.setStudentNo(rs.getString("student_no"));
            student.setStudentName(rs.getString("student_name"));
            student.setStudentAddress(rs.getString("student_address"));
            student.setStudentGender(rs.getString("student_gender"));
            student.setStudentContact(rs.getString("student_contact"));


            students.add(student);
        }
        jdbcUtils.release(rs,ps,connection);
        return students;
    }

    @Override
    public void delete(String studentNO) throws SQLException {
        JDBCUtils jdbcUtils=new JDBCUtils();
        Connection connection=jdbcUtils.getConnection();

        String sql="DELETE FROM student WHERE student_no=?";
        PreparedStatement ps=connection.prepareStatement(sql);
        ps.setString(1,studentNO);
        ps.executeUpdate();

        jdbcUtils.release(ps,connection);

    }

    @Override
    public void update(Student student) throws SQLException {
        JDBCUtils jdbcUtils=new JDBCUtils();
        Connection connection=jdbcUtils.getConnection();

        String sql="UPDATE student SET student_name=?,student_gender=?,student_borndate=?,student_contact=?,student_address=?,student_weight=? WHERE student_no = ?";

        PreparedStatement ps=connection.prepareStatement(sql);
        ps.setString(1,student.getStudentName());
        ps.setString(2,student.getStudentGender());
        ps.setDate(3,new java.sql.Date(student.getStudentBorndate().getTime()));
        ps.setString(4,student.getStudentContact());
        ps.setString(5,student.getStudentAddress());
        ps.setDouble(6,student.getStudentWeight());
        ps.setString(7,student.getStudentNo());

        ps.executeUpdate();

        jdbcUtils.release(ps,connection);


    }

    @Override
    public Student findById(String studentNO) throws SQLException {
        JDBCUtils jdbcUtils=new JDBCUtils();
        Connection connection=jdbcUtils.getConnection();
        String sql = "SELECT * FROM student WHERE student_no = ?" ;

        PreparedStatement ps=connection.prepareStatement(sql);
        ps.setString(1,studentNO);

        ResultSet rs=ps.executeQuery();
        Student student=null;

        if (rs.next()){
            student=new Student();
            student.setStudentNo(rs.getString("student_no"));
            student.setStudentName(rs.getString("student_name"));
            student.setStudentAddress(rs.getString("student_address"));
            student.setStudentBorndate(rs.getDate("student_borndate"));
            student.setStudentContact(rs.getString("student_contact"));
            student.setStudentGender(rs.getString("student_gender"));
            student.setStudentWeight(rs.getDouble("student_weight"));

            jdbcUtils.release(rs,ps,connection);

            return student;
        }


        return null;
    }

}
