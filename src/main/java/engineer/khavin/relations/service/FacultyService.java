package engineer.khavin.relations.service;

import engineer.khavin.relations.entity.Faculty;
import engineer.khavin.relations.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepository repo;

    public List<Faculty> getAllFaculties() {
        return repo.findAll();
    }

    public Faculty save(Faculty faculty) {
        return repo.save(faculty);
    }

    public Faculty getFacultyById(Long facultyId) {
        return repo.findById(facultyId).get();
    }
}
