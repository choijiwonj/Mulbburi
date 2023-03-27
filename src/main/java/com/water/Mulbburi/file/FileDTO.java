package com.water.Mulbburi.file;

import java.util.List;

import lombok.Data;

@Data
public class FileDTO {

	private int fileNo;
	private String fileoriginalName;
	private String filePath;
	private String fileSize;
	private String fileSavedName;
	private int custom;
	private int sbNo;
	private int memberNo;
	private int communityNo;
	private int reviewNo;
	private int bannerNo;
	private int ytNo;
	private List<FileDTO> fileList;
	public void setThumbnailPath(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setOriginalName(String originalFileName) {
		// TODO Auto-generated method stub
		
	}
	public void setSavedName(String savedFileName) {
		// TODO Auto-generated method stub
		
	}
	public void setSavePath(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setFileType(String string) {
		// TODO Auto-generated method stub
		
	}
	public String getSavePath() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getSavedName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}

