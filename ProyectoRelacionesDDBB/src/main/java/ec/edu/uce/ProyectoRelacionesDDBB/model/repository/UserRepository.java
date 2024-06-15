package ec.edu.uce.ProyectoRelacionesDDBB.model.repository;

import ec.edu.uce.ProyectoRelacionesDDBB.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Edgar Tipan
 */

public interface UserRepository extends JpaRepository<User, Long> {
}
