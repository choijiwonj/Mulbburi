
<<<<<<< HEAD
package com.water.Mulbburi.community.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.water.Mulbburi.community.dto.AttachmentDTO;
import com.water.Mulbburi.community.dto.CommunityDTO;
import com.water.Mulbburi.community.service.CommunityService;
import com.water.Mulbburi.member.dto.MemberDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j

@Controller

@RequestMapping("/community")
public class CommunityController {

	/*s
	 * @Value("${image.image-dir}") private String IMAGE_DTR;
	 * 
	 * private final CommunityService communityService; private final
	 * MessageSourceAccessor messageSourceAccessor;
	 * 
	 * public CommunityController(CommunityService communityService,
	 * MessageSourceAccessor messageSourceAccessor) { this.communityService =
	 * communityService; this.messageSourceAccessor = messageSourceAccessor; }
	 */

	@GetMapping("/regist")
	public String regist() {
		return "community/comWrite";
	}
	/*
	 * @PostMapping("/regist") public String registCommunity(CommunityDTO community,
	 * List<MultipartFile> attachImage,
	 * 
	 * @AuthenticationPrincipal MemberDTO member, RedirectAttributes rttr) {
	 * log.info("[ThumbnailController] board request : {}",community);
	 * log.info("[ThumbnailController] attachImage request : {}", attachImage);
	 * 
	 * String fileUploadDir = IMAGE_DIR + "original"; String communityDir =
	 * IMAGE_DIR + "thumbnail";
	 * 
	 * File dir1 = new File(fileUploadDir); File dir2 = new File(communityDir);
	 * 
	 * log.info("[CommunityController] dir1 : {}", dir1);
	 * log.info("[CommunityController] dir2 : {}", dir2);
	 * 
	 * 디렉토리가 없을 경우 생성한다. if(!dir1.exists() || !dir2.exists()) { dir1.mkdirs();
	 * dir2.mkdirs(); }
	 * 
	 * 업로드 파일에 대한 정보를 담을 리스트 List<AttachmentDTO> attachmentList = new ArrayList<>();
	 * 
	 * try {
	 */

	@GetMapping("/main")
	public String main() {
		return "community/communityMain";
	}

}
=======
>>>>>>> a7c0fc094262de0c8c17300c32766b27b1990ec5
