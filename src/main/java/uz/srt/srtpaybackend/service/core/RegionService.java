package uz.srt.srtpaybackend.service.core;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.srt.srtpaybackend.enteties.core.Region;
import uz.srt.srtpaybackend.enteties.core.TestTheme;
import uz.srt.srtpaybackend.repositories.core.RegionRepository;
import uz.srt.srtpaybackend.repositories.core.TestThemeRepository;

@Service
@RequiredArgsConstructor
public class RegionService {
    private final RegionRepository regionRepository;

    public Page<Region> getPage(Pageable pageable){
        return regionRepository.findAll(pageable);
    }

    public Region getOne(Long id){
        return regionRepository.findById(id).orElseThrow(() -> new RuntimeException("Data not found"));
    }

    public Region create(Region region){
        return regionRepository.save(region);
    }

    public Region update(Long id, Region region){
        return regionRepository.save(region);
    }

    public Boolean delete(Long id) {
        regionRepository.deleteById(id);
        return true;
    }
}
