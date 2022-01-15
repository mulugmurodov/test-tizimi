package uz.srt.srtpaybackend.controller.core;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.srt.srtpaybackend.enteties.core.District;
import uz.srt.srtpaybackend.service.core.DistrictService;


@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class DistrictController {
    public final DistrictService districtService;

    @GetMapping("/district")
    public ResponseEntity<?> getPage(Pageable pageable){
        return ResponseEntity.ok(districtService.getPage(pageable));
    }

    @GetMapping("/district/by-region/regionId")
    public ResponseEntity<?> getPageRegionId(Long regionId, Pageable pageable){
        return ResponseEntity.ok(districtService.getPageByRegionId(regionId, pageable));
    }

    @GetMapping("/district/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        return ResponseEntity.ok(districtService.getOne(id));
    }

    @PostMapping("/district")
    public ResponseEntity<?> create(@RequestBody District district){
        return ResponseEntity.ok(districtService.create(district));
    }

    @PutMapping("/district/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody District district){
        return ResponseEntity.ok(districtService.update(id, district));
    }

    @DeleteMapping("/district/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return ResponseEntity.ok(districtService.delete(id));
    }
}
