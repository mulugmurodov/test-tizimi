package uz.srt.srtpaybackend.controller.core;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.srt.srtpaybackend.enteties.core.Test;
import uz.srt.srtpaybackend.enteties.core.TestTheme;
import uz.srt.srtpaybackend.service.core.TestService;
import uz.srt.srtpaybackend.service.core.TestThemeService;


@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class TestController {
    public TestService testService;

    @GetMapping("/test")
    public ResponseEntity<?> getPage(Pageable pageable){
        return ResponseEntity.ok(testService.getPage(pageable));
    }

    @GetMapping("/test/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        return ResponseEntity.ok(testService.getOne(id));
    }

    @PostMapping("/test")
    public ResponseEntity<?> create(@RequestBody Test test){
        return ResponseEntity.ok(testService.create(test));
    }

    @PutMapping("/test/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Test test){
        return ResponseEntity.ok(testService.update(id, test));
    }

    @DeleteMapping("/test/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return ResponseEntity.ok(testService.delete(id));
    }
}
