package com.demo.GceCse.Controller;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class demoController {
	@RequestMapping("/")
		public String home()
		{
			return "pages/Demo";
		}

}
