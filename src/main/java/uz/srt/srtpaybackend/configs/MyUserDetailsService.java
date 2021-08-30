package uz.srt.srtpaybackend.configs;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import uz.srt.srtpaybackend.enteties.auth.User;
import uz.srt.srtpaybackend.repositories.UserRepository;
import uz.srt.srtpaybackend.utils.MyUserPrincipal;

import java.util.Objects;

@RequiredArgsConstructor
@Service
public class MyUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (Objects.isNull(user)){
            throw new UsernameNotFoundException(username);
        }

        return new MyUserPrincipal(user);
    }
}
