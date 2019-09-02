package com.app.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.controller.UploadingControllerFreemaker;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class ApplicationUploadFreemarker {
	
	 public static void main(String[] args) throws IOException {
	        new File(UploadingControllerFreemaker.uploadingDir).mkdirs();
	        SpringApplication.run(Application.class, args);
	    }
}
