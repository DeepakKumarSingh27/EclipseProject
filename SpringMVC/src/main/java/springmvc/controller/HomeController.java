package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/first",method = RequestMethod.GET)
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is Home url");
		model.addAttribute("name", "Deepak");
		model.addAttribute("id", 1234);
		List<String> friends = new ArrayList<String>();
		friends.add("BINI");
		friends.add("sapana");
		friends.add("ABC");
		model.addAttribute("f", friends);
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about page");
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("This is help controller");
		ModelAndView mt= new ModelAndView();
		mt.addObject("name", "uttam");
		mt.addObject("rollno",1234);
   LocalDateTime now = LocalDateTime.now();
   mt.addObject("time",now);
   
   List<Integer> list = new ArrayList<Integer>();
   list.add(12);
   list.add(3434);
   list.add(2134);
   list.add(2345);
   mt.addObject("marks", list);
		
		mt.setViewName("help");
		return mt;
	}
}
