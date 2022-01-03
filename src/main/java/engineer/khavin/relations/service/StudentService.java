package engineer.khavin.relations.service;

import engineer.khavin.relations.entity.Student;
import engineer.khavin.relations.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student save(Student student) {
        return repo.save(student);
    }

    public Student getStudentById(Long studentId) {
        return repo.findById(studentId).get();
    }
}
