package com.likelion.hw6;

import com.likelion.hw6.util.response.CustomAPIResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class baseController {
    @GetMapping("/hello")
    public ResponseEntity<CustomAPIResponse<?>> hello() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(CustomAPIResponse.createSuccess(HttpStatus.OK.value(), null, "이현승 Hw6 과제 제출합니다."));
    }
}
