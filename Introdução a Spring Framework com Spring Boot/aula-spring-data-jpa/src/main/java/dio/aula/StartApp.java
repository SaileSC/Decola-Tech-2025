package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Saile");
        user.setUsername("SaileSC");
        user.setPassword("Saile123");

        createUser(user);
        listUsers();

    }

    private void createUser(User user){
        userRepository.save(user);
    }

    private void listUsers(){
        for(User u:userRepository.findAll()){
            System.out.println(u);
        }
    }
}
