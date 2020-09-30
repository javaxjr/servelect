package com.csi.service;

import com.csi.domain.Student;


import java.util.List;

public interface StudentService {
    List<Student> list();

    void delete(String studentNO);

    void update(Student student);

    Student findById(String studentNO);

}
