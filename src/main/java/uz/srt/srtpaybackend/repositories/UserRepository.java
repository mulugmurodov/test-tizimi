package uz.srt.srtpaybackend.repositories;

import com.jayway.jsonpath.JsonPath;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.srt.srtpaybackend.dto.UserDTO;
import uz.srt.srtpaybackend.enteties.auth.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findOneById(Long id);

    Page<User> findAllByDeleted(Boolean deleted, Pageable pageable);
}
