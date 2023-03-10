package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sip.ams.controllers.ArticleController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
@SpringBootApplication
public class CampSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampSpringApplication.class, args);
		//new File(ArticleController.uploadDirectory).mkdir();
				Path path = Paths.get(ArticleController.uploadDirectory);
				try{
					Files.createDirectory(path);
				}
				catch(IOException ex){

				}
	}

}