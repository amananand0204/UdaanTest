package anand.aman.project.demo.repositories;

import anand.aman.project.demo.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
