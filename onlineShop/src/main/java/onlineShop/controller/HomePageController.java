package onlineShop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {

	@GetMapping("/index")
	public String sayIndex() {
		return "index";
	}

	@RequestMapping("/login")
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		
		if (error != null) {
			modelAndView.addObject("error", "Invalid username and Password");
		}

		if (logout != null) {
			modelAndView.addObject("logout", "You have logged out successfully");
		}
		return modelAndView;
	}

	@GetMapping("/aboutus")
	public String sayAbout() {
		return "aboutUs";
	}
}

