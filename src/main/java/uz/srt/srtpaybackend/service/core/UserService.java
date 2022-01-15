package uz.srt.srtpaybackend.service.core;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.srt.srtpaybackend.dto.UserDTO;
import uz.srt.srtpaybackend.enteties.auth.User;
import uz.srt.srtpaybackend.repositories.UserRepository;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Page<UserDTO> getPage(Pageable pageable) {
        return userRepository.findAllByDeleted(false, pageable)
                .map(User::toDTO);
    }

    public UserDTO getOne(Long id) {
        return userRepository.findOneById(id).toDTO();
    }

    public UserDTO create(UserDTO userDTO) {
        User user = userDTO.toEntity();
        if (Objects.isNull(user.getCreatedAt())) {
            user.setCreatedAt(LocalDateTime.now());
        }
        userRepository.save(user);
        return user.toDTO();
    }


    public UserDTO update(Long id, UserDTO userDTO) {
        User user = userDTO.toEntity();
        user.setUpdatedAt(LocalDateTime.now());
        userRepository.save(user);
        return user.toDTO();
    }

    public Boolean delete(Long id) {
        User user = userRepository.findOneById(id);
        user.setDeleted(true);
        user.setUpdatedAt(LocalDateTime.now());
        userRepository.save(user);
        return true;
    }
}
