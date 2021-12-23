package uz.srt.srtpaybackend.repositories.core;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.srt.srtpaybackend.enteties.core.District;
import uz.srt.srtpaybackend.enteties.core.Region;

public interface DistrictRepository extends JpaRepository<District, Long> {

}
