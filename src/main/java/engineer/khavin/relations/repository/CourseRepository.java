package engineer.khavin.relations.repository;

import engineer.khavin.relations.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
