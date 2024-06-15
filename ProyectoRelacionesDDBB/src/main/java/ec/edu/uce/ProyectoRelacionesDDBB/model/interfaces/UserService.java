package ec.edu.uce.ProyectoRelacionesDDBB.model.interfaces;

import ec.edu.uce.ProyectoRelacionesDDBB.model.entities.User;

import java.util.List;

/**
 * @author Edgar Tipan
 */

public interface UserService {

    List<User> findAll();

    void save(User user);
}
