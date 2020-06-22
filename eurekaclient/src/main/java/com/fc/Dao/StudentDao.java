package com.fc.Dao;

import com.fc.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface StudentDao {
    public Collection<Student> findAll();
    public void save(Student student);
    public void update(Student student);
    public void deleteById(Long id);

}
