package com.fc.service;

import com.fc.Dao.StudentDao;
import com.fc.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

public interface StudentService {

    public Collection<Student> findAll();
    public void save(Student student);
    public void update(Student student);
    public void deleteById(Long id);

}
