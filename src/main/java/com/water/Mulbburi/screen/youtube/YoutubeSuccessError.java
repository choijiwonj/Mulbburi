package com.water.Mulbburi.screen.youtube;

public class YoutubeSuccessError {
	
	public void success(String message) {
		
		switch(message) {
		case "insertYoutube": System.out.println("DB insert 성공!");
		}
		
	}

	public void error(String message) {
		
		switch(message) {
		case "failInsertYoutube": System.out.println("DB insert 실패");
		}
		
	}
		
	
	

}
