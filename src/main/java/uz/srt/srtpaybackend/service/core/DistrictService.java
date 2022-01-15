package uz.srt.srtpaybackend.service.core;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.srt.srtpaybackend.enteties.core.District;
import uz.srt.srtpaybackend.repositories.core.DistrictRepository;

@Service
@RequiredArgsConstructor
public class DistrictService {
    private final DistrictRepository districtRepository;

    public Page<District> getPage(Pageable pageable){
        return districtRepository.findAll(pageable);
    }

    public District getOne(Long id){
        return districtRepository.findById(id).orElseThrow(() -> new RuntimeException("Data not found"));
    }

    public District create(District district){
        return districtRepository.save(district);
    }

    public District update(Long id, District district){
        return districtRepository.save(district);
    }

    public Boolean delete(Long id) {
        districtRepository.deleteById(id);
        return true;
    }

    public Page<District> getPageByRegionId(Long regionId, Pageable pageable) {
        return districtRepository.findAllByRegionId(regionId, pageable);
    }
}
