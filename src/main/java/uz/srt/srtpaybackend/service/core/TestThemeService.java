package uz.srt.srtpaybackend.service.core;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.srt.srtpaybackend.enteties.core.TestTheme;
import uz.srt.srtpaybackend.repositories.core.TestThemeRepository;

@Service
@RequiredArgsConstructor
public class TestThemeService {
    private final TestThemeRepository testThemeRepository;

    public Page<TestTheme> getPage(Pageable pageable){
        return testThemeRepository.findAll(pageable);
    }

    public TestTheme getOne(Long id){
        return testThemeRepository.findById(id).orElseThrow(() -> new RuntimeException("Data not found"));
    }

    public TestTheme create(TestTheme testTheme){
        return testThemeRepository.save(testTheme);
    }

    public TestTheme update(Long id, TestTheme testTheme){
        return testThemeRepository.save(testTheme);
    }

    public Boolean delete(Long id) {
        testThemeRepository.deleteById(id);
        return true;
    }
}
