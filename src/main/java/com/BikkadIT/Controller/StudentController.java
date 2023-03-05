package com.BikkadIT.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StudentController {
	@GetMapping("/getmsg/{fname}/{lname}")
	public String getmsg(@PathVariable String fname,@PathVariable String lname, Model model ) {
		String str="my first name is :"+fname+" my last name is :"+lname;
		System.out.println(str);
		model.addAttribute("MSG",str);
		return "MASSAGE";
		
	}

}
