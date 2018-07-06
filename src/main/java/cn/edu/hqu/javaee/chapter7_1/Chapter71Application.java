package cn.edu.hqu.javaee.chapter7_1;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chapter71Application {
	public static final String ROOT = "D:\\upload-dir";
	public static void main(String[] args) throws IOException {
		File file=new File(ROOT);
		if(!file.exists()) {
			file.mkdir();
		}
		
		SpringApplication.run(Chapter71Application.class, args);
	}
}
