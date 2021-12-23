package uz.srt.srtpaybackend.repositories.core;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.srt.srtpaybackend.enteties.core.Test;

public interface TestRepository extends JpaRepository<Test, Long> {

}
