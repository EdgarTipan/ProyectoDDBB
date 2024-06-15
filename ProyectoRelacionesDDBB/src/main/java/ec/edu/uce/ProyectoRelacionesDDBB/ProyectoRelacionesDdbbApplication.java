package ec.edu.uce.ProyectoRelacionesDDBB;

import ec.edu.uce.ProyectoRelacionesDDBB.controller.UserAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Edgar Tipan
 */

@SpringBootApplication
public class ProyectoRelacionesDdbbApplication implements CommandLineRunner {

    private final UserAppService userAppService;

    @Autowired
    public ProyectoRelacionesDdbbApplication(UserAppService userAppService) {
        this.userAppService = userAppService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProyectoRelacionesDdbbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userAppService.run();
    }
}
