package ec.edu.uce.ProyectoRelacionesDDBB.model.services;

import ec.edu.uce.ProyectoRelacionesDDBB.model.entities.User;
import ec.edu.uce.ProyectoRelacionesDDBB.model.interfaces.UserService;
import ec.edu.uce.ProyectoRelacionesDDBB.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Edgar Tipan
 */

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}