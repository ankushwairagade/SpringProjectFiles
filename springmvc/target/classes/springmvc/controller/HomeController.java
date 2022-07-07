package springmvc.controller;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home()
	{
		System.out.println("this is index page");
		return "index";
	}
	
	
	
}
