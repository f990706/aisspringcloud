package com.fc.service.serviceImpl;

import com.fc.Dao.StudentDao;
import com.fc.entity.Student;
import com.fc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServiceImp implements StudentService {
    private static Map<Long,Student> studentMap;
    static{
        studentMap=new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",22));
        studentMap.put(2L,new Student(2L,"李四",18));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public void save(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void update(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(Long id) {
        studentMap.remove(id);
    }
}
