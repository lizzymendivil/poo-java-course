package com.jalasoft.project.service;

import com.jalasoft.project.exception.StorageException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author Lizzy Mendivil
 * @version 1.1
 */
@Service
public class StorageService {

    @Value("${upload.path}")
    private String path;

    public void uploadFile(MultipartFile file) {
        if (file.isEmpty()) {
            throw new StorageException("Failed to store empty file");
        }

        try {
            String fileName = file.getOriginalFilename();
            Path copyLocation = Paths
                    .get(path + fileName);
            Files.copy(file.getInputStream(), copyLocation, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            String msg = String.format("Failed to store file %s", file.getName());

            throw new StorageException(msg, e);
        }
    }
}
