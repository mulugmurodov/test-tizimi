package uz.srt.srtpaybackend.controller.core;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.srt.srtpaybackend.dto.UserDTO;
import uz.srt.srtpaybackend.enteties.core.Test;
import uz.srt.srtpaybackend.service.core.UserService;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;


    @GetMapping("/user")
    public ResponseEntity<?> getPage(Pageable pageable){
        return ResponseEntity.ok(userService.getPage(pageable));
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        return ResponseEntity.ok(userService.getOne(id));
    }

    @PostMapping("/user")
    public ResponseEntity<?> create(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok(userService.create(userDTO));
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody UserDTO userDTO){
        return ResponseEntity.ok(userService.update(id, userDTO));
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return ResponseEntity.ok(userService.delete(id));
    }
}
