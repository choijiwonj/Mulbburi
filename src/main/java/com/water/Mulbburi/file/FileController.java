package com.water.Mulbburi.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class FileController {
	
//	@Value("${image.image-dir}")
//	private String IMAGE_DIR;

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
