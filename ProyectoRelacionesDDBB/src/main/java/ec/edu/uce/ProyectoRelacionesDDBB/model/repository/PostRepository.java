package ec.edu.uce.ProyectoRelacionesDDBB.model.repository;

import ec.edu.uce.ProyectoRelacionesDDBB.model.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Edgar Tipan
 */

public interface PostRepository extends JpaRepository<Post, Long> {
}
