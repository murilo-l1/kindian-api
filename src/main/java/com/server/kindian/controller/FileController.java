package com.server.kindian.controller;

import jakarta.validation.Valid;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController("FileController")
@Validated
@RequestMapping(value = "/api/files", produces = MediaType.APPLICATION_JSON_VALUE)
public class FileController {


    @PostMapping("/show")
    public ResponseEntity<String> getAndShowProperties(@Valid @RequestParam("file") final MultipartFile file) {

        final String testBody = String.format(
                """
                name: %s,
                type: %s,
                size: %.2f KB
                """, file.getOriginalFilename(), file.getContentType(), file.getSize() / 1024.0);

        return ResponseEntity.ok(testBody);
    }


}
