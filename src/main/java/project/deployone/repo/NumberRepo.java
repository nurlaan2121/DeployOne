package project.deployone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.deployone.entity.Number;

@Repository
public interface NumberRepo extends JpaRepository<Number,Long> {
}
