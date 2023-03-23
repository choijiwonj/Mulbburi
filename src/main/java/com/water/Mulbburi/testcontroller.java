
<<<<<<< HEAD
=======
  package com.water.Mulbburi;
  
  import org.springframework.stereotype.Controller;

  
  
  
  import org.springframework.web.bind.annotation.GetMapping;
  
  
  import org.springframework.web.bind.annotation.RestController;
  
  import org.springframework.web.servlet.view.RedirectView;
  

@Controller
public class testcontroller {


	@GetMapping("/*")
	public String test() {
		return "main/01.purchase";
	}

	/*
	 * @GetMapping("/") public String test2() { return "/main/01.purchase"; }
	 * 
	 */
  
  
  
	/*
	 * @GetMapping("/*") public String test2() { return "screen/08. screenControll";
	 * }
	 */

  
	/*
	 * @GetMapping("/*") public String test2() { return "screen/08. screenControll";
	 * }
	 */
  }
  
  


>>>>>>> 278d0fc39f054a6e31dfb3866283a674e67d1540
