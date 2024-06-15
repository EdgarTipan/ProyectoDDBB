package ec.edu.uce.ProyectoRelacionesDDBB.model.services;

import ec.edu.uce.ProyectoRelacionesDDBB.model.entities.Post;
import ec.edu.uce.ProyectoRelacionesDDBB.model.interfaces.PostService;
import ec.edu.uce.ProyectoRelacionesDDBB.model.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Edgar Tipan
 */

@Service
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void save(Post post) {
        postRepository.save(post);
    }
}