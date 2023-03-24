package com.water.Mulbburi.file;

import java.io.IOException;
import java.util.UUID;

import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class FileController {
	
	private final FileService fileService;
	
	@Autowired
	public FileController(FileService fileService) {
		this.fileService = fileService;
	}
	
	@PostMapping("regist/file")
	public String registFile(@ModelAttribute FileDTO fileDTO ) {
		
		fileService.registFile(fileDTO);
		
		return "redirect:screen/08-1. bannerControll";
	}
	
	
	

}
