package uz.srt.srtpaybackend;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import uz.srt.srtpaybackend.enteties.User;
import uz.srt.srtpaybackend.repositories.UserRepository;

@SpringBootApplication
@RequiredArgsConstructor
public class SrtPayBackendApplication implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(SrtPayBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count() > 0){
            return;
        }
        User user = new User();
        user.setUsername("admin");
        user.setPassword(passwordEncoder.encode("adminadmin"));
        userRepository.save(user);
    }
}
