package Back.employer.repository;

import Back.employer.domain.entity.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employerRepository extends JpaRepository<Employer, Long> {
}
