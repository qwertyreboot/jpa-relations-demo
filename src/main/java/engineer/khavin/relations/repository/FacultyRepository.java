package engineer.khavin.relations.repository;

import engineer.khavin.relations.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
