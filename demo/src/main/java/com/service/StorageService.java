package com.service;

import com.exception.StorageException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class StorageService {
	@Value("${upload.path}")
    private String path;

    public void uploadFile(MultipartFile file) {

//        if (file.isEmpty()) {
//            throw new StorageException("Failed to store empty file");
//        }
//
//        try {
////             fileName = file.getOriginalFilename();
////             is = file.getInputStream();
//
////            Files.copy(is, Paths.get(path + fileName),
////                    StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//
////             msg = String.format("Failed to store file", file.getName());
//
////            throw new StorageException(msg, e);
//        }

    }
}
