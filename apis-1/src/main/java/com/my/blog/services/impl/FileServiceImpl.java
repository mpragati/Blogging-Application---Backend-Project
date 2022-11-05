package com.my.blog.services.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.my.blog.services.FileService;

@Service
public class FileServiceImpl implements FileService {

	@Override
	public String uploadImage(String path, MultipartFile file) throws IOException {
		
		//Filename (abc.png)
		String name = file.getOriginalFilename();
		
		//Generate random filename (randomID.png)
		String randomID = UUID.randomUUID().toString();
		String fileName = randomID.concat(name.substring(name.lastIndexOf("."))); 
		
		//Full file path
		String fullPath = path + File.separator + fileName;
		
		//create folder if not created
		File f=new File(path);
		if(!f.exists()) {
			f.mkdir();
		}
		
		//Copy file
		Files.copy(file.getInputStream(), Paths.get(fullPath));
		
		return fileName;
}

	@Override
	public InputStream getResource(String path, String fileName) throws FileNotFoundException {
		
		String fullPath = path + File.separator + fileName;
		InputStream is = new FileInputStream(fullPath);
		return is;
	}

}
