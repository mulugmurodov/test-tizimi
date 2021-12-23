package uz.srt.srtpaybackend.repositories.core;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.srt.srtpaybackend.enteties.core.Region;
import uz.srt.srtpaybackend.enteties.core.Test;

public interface RegionRepository extends JpaRepository<Region, Long> {

}
