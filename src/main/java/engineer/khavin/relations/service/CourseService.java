package engineer.khavin.relations.service;

import engineer.khavin.relations.entity.Course;
import engineer.khavin.relations.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository repo;


    public Course save(Course course) {
        return repo.save(course);
    }

    public List<Course> getAllCourses() {
        return repo.findAll();
    }

    public Course getCourseById(Long id) {
        return repo.findById(id).get();
    }
}
