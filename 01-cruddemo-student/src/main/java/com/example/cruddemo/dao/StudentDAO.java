package com.example.cruddemo.dao;
import com.example.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student findById(Integer Id);
    List<Student> findAll();
    List<Student> findByLastName(String theLastName);
    void update(Student thestudent);
    void delete(Integer id);
    int deleteAll();

}
