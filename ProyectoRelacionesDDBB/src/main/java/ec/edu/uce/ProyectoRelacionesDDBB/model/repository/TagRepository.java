package ec.edu.uce.ProyectoRelacionesDDBB.model.repository;

import ec.edu.uce.ProyectoRelacionesDDBB.model.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Edgar Tipan
 */

public interface TagRepository extends JpaRepository<Tag, Long> {
}
