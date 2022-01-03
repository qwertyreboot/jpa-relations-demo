package engineer.khavin.relations.repository;

import engineer.khavin.relations.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
