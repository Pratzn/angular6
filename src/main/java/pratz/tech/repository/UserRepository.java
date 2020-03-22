package pratz.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pratz.tech.controller.v1.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, String> {


}