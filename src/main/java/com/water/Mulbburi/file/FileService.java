
package com.water.Mulbburi.file;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class FileService {

	private final FileMapper fileMapper;
	
	public FileService(FileMapper fileMapper) {
		this.fileMapper = fileMapper;
	}

	public List<FileDTO> selectFile() {

        return null;

        
    }

}
