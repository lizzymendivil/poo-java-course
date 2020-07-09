package com.jalasoft.project.controller;

import com.jalasoft.project.exception.StorageException;
import com.jalasoft.project.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Lizzy Mendivil
 * @version 1.1
 */
@RestController
@RequestMapping("/upload")
public class FileController {

    @Autowired
    private StorageService storageService;

    @PostMapping
    public String upload(@RequestParam("file") MultipartFile file) {
        storageService.uploadFile(file);
        return "File uploaded successfully";
    }

    @ExceptionHandler(StorageException.class)
    public String handleStorageFileNotFound(StorageException e) {
        return "File could not be uploaded";
    }
}
