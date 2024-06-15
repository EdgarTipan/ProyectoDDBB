package ec.edu.uce.ProyectoRelacionesDDBB.model.services;

import ec.edu.uce.ProyectoRelacionesDDBB.model.entities.Profile;
import ec.edu.uce.ProyectoRelacionesDDBB.model.interfaces.ProfileService;
import ec.edu.uce.ProyectoRelacionesDDBB.model.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Edgar Tipan
 */

@Service
public class ProfileServiceImpl implements ProfileService {
    private final ProfileRepository profileRepository;

    @Autowired
    public ProfileServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public Profile save(Profile profile) {
        return profileRepository.save(profile);
    }
}
