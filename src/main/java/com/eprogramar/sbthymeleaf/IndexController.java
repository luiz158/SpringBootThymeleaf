package com.eprogramar.sbthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String home(Model model){
		System.out.println( "home()..." );
		model.addAttribute("activeMenu", "home");
		return "index";
	}
	
	@RequestMapping("/product")
	public String product(Model model){
		System.out.println( "product()..." );
		model.addAttribute("activeMenu", "product");
		model.addAttribute("moduleTitle", "Products");
		return "product";
	}
	
	@RequestMapping("/customer")
	public String customer(Model model){
		System.out.println( "customer()..." );
		model.addAttribute("activeMenu", "customer");
		model.addAttribute("moduleTitle", "Customers");
		return "product";
	}
	
}
