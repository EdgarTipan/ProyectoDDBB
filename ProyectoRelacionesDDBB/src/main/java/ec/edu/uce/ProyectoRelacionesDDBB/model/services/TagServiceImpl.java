package ec.edu.uce.ProyectoRelacionesDDBB.model.services;

import ec.edu.uce.ProyectoRelacionesDDBB.model.entities.Tag;
import ec.edu.uce.ProyectoRelacionesDDBB.model.repository.TagRepository;
import ec.edu.uce.ProyectoRelacionesDDBB.model.interfaces.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Edgar Tipan
 */

@Service
public class TagServiceImpl implements TagService {
    private final TagRepository tagRepository;

    @Autowired
    public TagServiceImpl(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @Override
    public void save(Tag tag) {
        tagRepository.save(tag);
    }
}