package anand.aman.project.demo.repositories;

import anand.aman.project.demo.models.Symptom;
import org.springframework.data.repository.CrudRepository;

public interface SymptomRepository extends CrudRepository<Symptom, Long> {
}
