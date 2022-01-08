package uz.srt.srtpaybackend.controller.core;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.srt.srtpaybackend.enteties.core.Test;
import uz.srt.srtpaybackend.enteties.core.TestAnswer;
import uz.srt.srtpaybackend.service.core.TestAnswerService;
import uz.srt.srtpaybackend.service.core.TestService;


@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class TestAnswerController {
    public final TestAnswerService testAnswerService;

    @GetMapping("/test-answer")
    public ResponseEntity<?> getPage(Pageable pageable){
        return ResponseEntity.ok(testAnswerService.getPage(pageable));
    }

    @GetMapping("/test-answer/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        return ResponseEntity.ok(testAnswerService.getOne(id));
    }

    @PostMapping("/test-answer")
    public ResponseEntity<?> create(@RequestBody TestAnswer testAnswer){
        return ResponseEntity.ok(testAnswerService.create(testAnswer));
    }

    @PutMapping("/test-answer/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody TestAnswer testAnswer){
        return ResponseEntity.ok(testAnswerService.update(id, testAnswer));
    }

    @DeleteMapping("/test-answer/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return ResponseEntity.ok(testAnswerService.delete(id));
    }
}
