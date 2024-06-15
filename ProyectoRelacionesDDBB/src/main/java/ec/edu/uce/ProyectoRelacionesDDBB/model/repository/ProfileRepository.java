package ec.edu.uce.ProyectoRelacionesDDBB.model.repository;

import ec.edu.uce.ProyectoRelacionesDDBB.model.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Edgar Tipan
 */

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}

