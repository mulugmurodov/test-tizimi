package uz.srt.srtpaybackend.service.core;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.srt.srtpaybackend.enteties.core.Test;
import uz.srt.srtpaybackend.enteties.core.TestTheme;
import uz.srt.srtpaybackend.repositories.core.TestRepository;
import uz.srt.srtpaybackend.repositories.core.TestThemeRepository;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    public Page<Test> getPage(Pageable pageable){
        return testRepository.findAll(pageable);
    }

    public Test getOne(Long id){
        return testRepository.findById(id).orElseThrow(() -> new RuntimeException("Data not found"));
    }

    public Test create(Test test){
        return testRepository.save(test);
    }

    public Test update(Long id, Test test){
        return testRepository.save(test);
    }

    public Boolean delete(Long id) {
        testRepository.deleteById(id);
        return true;
    }
}
