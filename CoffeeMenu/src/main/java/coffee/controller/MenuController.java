package coffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import coffee.beans.Menu;
import coffee.repo.IMenuRepo;

//@author valei - vlunderwood CIS175 - Fall 2023 Oct 15, 2023

@Controller
public class MenuController {
	@Autowired
	IMenuRepo repo;

	@GetMapping("/")
	public String getForm(Menu menu) {
		return "index";
	}
	
	@GetMapping("/add.html")
	public String getAdd(Menu menu) {
		return "add";
	}
	
	@GetMapping("/delete.html")
	public String getDelete(Menu menu) {
		return "delete";
	}
	
	@GetMapping("/update.html")
	public String getUpdate(Menu menu) {
		return "update";
	}
	
	/* This one will have to be more like add-mnue, since you need to get data from the DB prior to loading the page
	@GetMapping("/show.html")
	public String getForm(Menu menu) {
		return "show";
	}*/

	@PostMapping("/add-menu")
	public String addMenuDetails(Menu menu, Errors errors, Model model) {
		if (null != errors && errors.getErrorCount() > 0) {
			return "index";
		} else {
			repo.save(menu);
			model.addAttribute("successMsg", "Added successfully!");
			return "index";
		}
	}
}
