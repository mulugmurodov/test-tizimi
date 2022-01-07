package uz.srt.srtpaybackend.service.core;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.srt.srtpaybackend.enteties.core.Test;
import uz.srt.srtpaybackend.enteties.core.TestAnswer;
import uz.srt.srtpaybackend.repositories.core.TestAnswerRepository;
import uz.srt.srtpaybackend.repositories.core.TestRepository;

@Service
@RequiredArgsConstructor
public class TestAnswerService {
    private final TestAnswerRepository testAnswerRepository;

    public Page<TestAnswer> getPage(Pageable pageable){
        return testAnswerRepository.findAll(pageable);
    }

    public TestAnswer getOne(Long id){
        return testAnswerRepository.findById(id).orElseThrow(() -> new RuntimeException("Data not found"));
    }

    public TestAnswer create(TestAnswer testAnswer){
        return testAnswerRepository.save(testAnswer);
    }

    public TestAnswer update(Long id, TestAnswer testAnswer){
        return testAnswerRepository.save(testAnswer);
    }

    public Boolean delete(Long id) {
        testAnswerRepository.deleteById(id);
        return true;
    }
}
