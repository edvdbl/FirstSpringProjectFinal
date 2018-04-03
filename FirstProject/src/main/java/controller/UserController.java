package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import org.springframework.validation.BindingResult;

import entity.User;
import service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/nextPage")
	public String nextPage() {
		return "nextPage";
	}
	
	@GetMapping("/users")
	//Model need for working between view and controller
	public String getAllUsers(Model model) {
		model.addAttribute("users", userService.getAll());
		return "usersList";
	}
	
	@GetMapping("/user/{id}")
	public String getById(@PathVariable("id") int id, Model model) {
		model.addAttribute("user", userService.getById(id));
		return "showUser";
	}

	@GetMapping("/update/{id}")
	public String update(@PathVariable("id") int id, Model model) {
		model.addAttribute("user", userService.getById(id));
		return "editUser";
	}
	
	@PostMapping("/updateUser")
	public String updateUser(@ModelAttribute("user") User user) {
		userService.update(user);
		return "redirect:/user/" + user.getId();
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		userService.delete(id);
		return "redirect:/users";
	}

	@PostMapping("/addUser")
	public String addUser(@Valid User user, BindingResult bindingResult, Model model) {
		if (!bindingResult.hasErrors()) {
            model.addAttribute("noErrors", true);
            userService.save(user);
        }
        return "createUser";
	}
	
	@GetMapping("/addUser")
	public String createUserPage(Model model) {
		model.addAttribute("user", new User());
		return "createUser";
	} 
		
}
