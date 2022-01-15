package uz.srt.srtpaybackend.repositories.core;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import uz.srt.srtpaybackend.dto.ContestDTO;
import uz.srt.srtpaybackend.enteties.core.Contest;

public interface ContestRepository extends JpaRepository<Contest, Long> {

    Page<Contest> findAllByDeleted(boolean deleted, Pageable pageable);
}
