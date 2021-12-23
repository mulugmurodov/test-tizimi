package uz.srt.srtpaybackend.controller.core;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.srt.srtpaybackend.enteties.core.TestTheme;
import uz.srt.srtpaybackend.service.core.TestThemeService;


@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class TestThemeController {
    public TestThemeService testThemeService;

    @GetMapping("/test-theme")
    public ResponseEntity<?> getPage(Pageable pageable){
        return ResponseEntity.ok(testThemeService.getPage(pageable));
    }

    @GetMapping("/test-theme/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        return ResponseEntity.ok(testThemeService.getOne(id));
    }

    @PostMapping("/test-theme")
    public ResponseEntity<?> create(@RequestBody TestTheme testTheme){
        return ResponseEntity.ok(testThemeService.create(testTheme));
    }

    @PutMapping("/test-theme/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody TestTheme testTheme){
        return ResponseEntity.ok(testThemeService.update(id, testTheme));
    }

    @DeleteMapping("/test-theme/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return ResponseEntity.ok(testThemeService.delete(id));
    }
}
