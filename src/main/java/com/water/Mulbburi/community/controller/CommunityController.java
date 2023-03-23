
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d4d2e193517ba0a5342894b3e67a892cac5ba8f6
=======
>>>>>>> ce09bbe31cfebfbd80b3806620d27b7662545e73
=======
>>>>>>> 278d0fc39f054a6e31dfb3866283a674e67d1540
package com.water.Mulbburi.community.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;



import com.water.Mulbburi.community.dto.CommunityDTO;
import com.water.Mulbburi.community.dto.ReplyDTO;
import com.water.Mulbburi.community.service.CommunityService;
import com.water.Mulbburi.member.dto.MemberDTO;
=======
>>>>>>> 278d0fc39f054a6e31dfb3866283a674e67d1540

import lombok.extern.slf4j.Slf4j;



@Slf4j
@Controller
@RequestMapping("/community")

public class CommunityController {

	

	@GetMapping("/main")
	public String main() {
		return "community/communityMain";
	}
	
	


	}

<<<<<<< HEAD

}

=======
>>>>>>> 278d0fc39f054a6e31dfb3866283a674e67d1540
