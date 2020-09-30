package com.csi.dao;

import com.csi.domain.Student;


import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    List<Student> list() throws SQLException;

    void delete(String studentNO) throws SQLException;

    void update(Student student) throws SQLException;

    Student findById(String studentNO) throws SQLException;

}
