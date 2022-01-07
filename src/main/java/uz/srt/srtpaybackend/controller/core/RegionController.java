package uz.srt.srtpaybackend.controller.core;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.srt.srtpaybackend.enteties.core.Region;
import uz.srt.srtpaybackend.enteties.core.TestTheme;
import uz.srt.srtpaybackend.service.core.RegionService;
import uz.srt.srtpaybackend.service.core.TestThemeService;


@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class RegionController {
    public final RegionService regionService;

    @GetMapping("/region")
    public ResponseEntity<?> getPage(Pageable pageable){
        return ResponseEntity.ok(regionService.getPage(pageable));
    }

    @GetMapping("/region/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        return ResponseEntity.ok(regionService.getOne(id));
    }

    @PostMapping("/region")
    public ResponseEntity<?> create(@RequestBody Region region){
        return ResponseEntity.ok(regionService.create(region));
    }

    @PutMapping("/region/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Region region){
        return ResponseEntity.ok(regionService.update(id, region));
    }

    @DeleteMapping("/region/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return ResponseEntity.ok(regionService.delete(id));
    }
}
