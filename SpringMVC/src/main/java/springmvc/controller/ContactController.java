package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.jdt.internal.compiler.apt.model.ModuleElementImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Learncodewith Deepak");
		m.addAttribute("Desc", "Home for programmer");
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {

		return "contact";
	}

	@RequestMapping(path = "processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		this.userService.createUser(user);
		return "success";
	}

}

/*
 * style 1
 * 
 * @RequestMapping(path = "processform",method = RequestMethod.POST) public
 * String handleForm(
 * 
 * @RequestParam("email") String useremail,
 * 
 * @RequestParam("userName") String userName,
 * 
 * @RequestParam("password") String password,Model m) {
 * System.out.println("userEmail "+useremail);
 * System.out.println("user name "+userName);
 * System.out.println("user pwd "+password); m.addAttribute("name", userName);
 * m.addAttribute("email", useremail); m.addAttribute("password", password);
 * return "success"; }
 * 
 * style 2
 * 
 * @RequestMapping(path = "processform",method = RequestMethod.POST) public
 * String handleForm(
 * 
 * @RequestParam("email") String useremail,
 * 
 * @RequestParam("userName") String userName,
 * 
 * @RequestParam("password") String password,Model m) { User user = new User();
 * user.setEmail(useremail); user.setUserName(userName);
 * user.setPassword(password);
 * 
 * System.out.println(user); // m.addAttribute("name", userName); //
 * m.addAttribute("email", useremail); // m.addAttribute("password", password);
 * m.addAttribute("user", user); return "success"; }
 */
