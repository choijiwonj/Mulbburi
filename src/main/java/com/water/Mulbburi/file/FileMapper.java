package com.water.Mulbburi.file;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FileMapper {
	
	List<FileDTO> selectAllFile();

}
