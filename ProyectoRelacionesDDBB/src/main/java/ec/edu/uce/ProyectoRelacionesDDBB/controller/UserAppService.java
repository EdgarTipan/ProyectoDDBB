package ec.edu.uce.ProyectoRelacionesDDBB.controller;

import ec.edu.uce.ProyectoRelacionesDDBB.model.entities.Post;
import ec.edu.uce.ProyectoRelacionesDDBB.model.entities.Profile;
import ec.edu.uce.ProyectoRelacionesDDBB.model.entities.Tag;
import ec.edu.uce.ProyectoRelacionesDDBB.model.entities.User;
import ec.edu.uce.ProyectoRelacionesDDBB.model.interfaces.PostService;
import ec.edu.uce.ProyectoRelacionesDDBB.model.interfaces.ProfileService;
import ec.edu.uce.ProyectoRelacionesDDBB.model.interfaces.TagService;
import ec.edu.uce.ProyectoRelacionesDDBB.model.interfaces.UserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Edgar Tipan
 */

@Service
public class UserAppService {

    private final UserService userService;
    private final ProfileService profileService;
    private final PostService postService;
    private final TagService tagService;

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public UserAppService(UserService userService, ProfileService profileService,
                          PostService postService, TagService tagService) {
        this.userService = userService;
        this.profileService = profileService;
        this.postService = postService;
        this.tagService = tagService;
    }

    @Transactional
    public void run() {
        // Creamos un usuario
        User user = new User();
        user.setName("Edgar Tipan");

        Profile profile = new Profile();
        profile.setBio("Estudiante de programacion");
        profile.setUser(user);

        user.setProfile(profile);

        Post post1 = new Post();
        post1.setTitle("Tarea de Spring");
        post1.setUser(user);

        Post post2 = new Post();
        post2.setTitle("Tarea de Galaga");
        post2.setUser(user);

        user.getPosts().add(post1);
        user.getPosts().add(post2);

        Tag tag1 = new Tag();
        tag1.setName("Spring");

        Tag tag2 = new Tag();
        tag2.setName("Hibernate");

        // Guardamos los tags
        tagService.save(tag1);
        tagService.save(tag2);

        // Asociamos los tags a los posts
        post1.getTags().add(tag1);
        post1.getTags().add(tag2);

        post2.getTags().add(tag1);

        tag1.getPosts().add(post1);
        tag1.getPosts().add(post2);

        tag2.getPosts().add(post1);

        // Guardamos las entidades y sus debidas relaciones
        userService.save(user);
        postService.save(post1);
        postService.save(post2);

        // Imprimimos los usuarios, perfiles,posts y tags
        userService.findAll().forEach(u -> {
            entityManager.refresh(u);
            System.out.println("User: " + u.getName());
            System.out.println("Profile: " + u.getProfile().getBio());
            u.getPosts().forEach(p -> {
                System.out.println("Post: " + p.getTitle());
                p.getTags().forEach(t -> System.out.println("Tag: " + t.getName()));
            });
        });
    }
}