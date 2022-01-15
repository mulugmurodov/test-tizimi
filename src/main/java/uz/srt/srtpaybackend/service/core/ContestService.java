package uz.srt.srtpaybackend.service.core;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.srt.srtpaybackend.dto.ContestDTO;
import uz.srt.srtpaybackend.enteties.core.Contest;
import uz.srt.srtpaybackend.enteties.core.Test;
import uz.srt.srtpaybackend.repositories.core.ContestRepository;
import uz.srt.srtpaybackend.repositories.core.TestRepository;

import java.sql.Struct;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ContestService {
    private final ContestRepository contestRepository;

    public Page<ContestDTO> getPage(Pageable pageable){
        return contestRepository.findAllByDeleted(false, pageable).map(Contest::toDTO);
    }

    public ContestDTO getOne(Long id){
        return contestRepository.findById(id).map(Contest::toDTO).orElseThrow(() -> new RuntimeException("Data not found"));
    }

    public ContestDTO create(ContestDTO contestDTO){
        Contest contest = contestDTO.toEntity();
        contest.setCreatedAt(LocalDateTime.now());
        return contestRepository.save(contest).toDTO();
    }

    public ContestDTO update(Long id, ContestDTO contestDTO){
        Contest contest = contestDTO.toEntity();
        contest.setUpdatedAt(LocalDateTime.now());
        return contestRepository.save(contestDTO.toEntity()).toDTO();
    }

    public Boolean delete(Long id) {
        Contest contest = contestRepository.findById(id).orElseThrow(() -> new RuntimeException("Error"));
        contest.setDeleted(true);
        contest.setUpdatedAt(LocalDateTime.now());
        contestRepository.save(contest);
        return true;
    }
}
