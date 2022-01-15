package uz.srt.srtpaybackend.repositories.core;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import uz.srt.srtpaybackend.enteties.core.District;
import uz.srt.srtpaybackend.enteties.core.Region;

public interface DistrictRepository extends JpaRepository<District, Long> {

    Page<District> findAllByRegionId(Long regionId, Pageable pageable);
}
