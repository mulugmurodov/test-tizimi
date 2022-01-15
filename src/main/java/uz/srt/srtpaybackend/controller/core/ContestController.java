package uz.srt.srtpaybackend.controller.core;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.srt.srtpaybackend.dto.ContestDTO;
import uz.srt.srtpaybackend.enteties.core.Test;
import uz.srt.srtpaybackend.service.core.ContestService;
import uz.srt.srtpaybackend.service.core.TestService;


@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class ContestController {
    public final ContestService testService;

    @GetMapping("/contest")
    public ResponseEntity<?> getPage(Pageable pageable){
        return ResponseEntity.ok(testService.getPage(pageable));
    }

    @GetMapping("/contest/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        return ResponseEntity.ok(testService.getOne(id));
    }

    @PostMapping("/contest")
    public ResponseEntity<?> create(@RequestBody ContestDTO contestDTO){
        return ResponseEntity.ok(testService.create(contestDTO));
    }

    @PutMapping("/contest/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody ContestDTO contestDTO){
        return ResponseEntity.ok(testService.update(id, contestDTO));
    }

    @DeleteMapping("/contest/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return ResponseEntity.ok(testService.delete(id));
    }
}
