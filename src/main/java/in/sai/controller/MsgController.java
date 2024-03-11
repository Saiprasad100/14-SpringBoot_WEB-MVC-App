package in.sai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() //ModelAndView is Pre defined class in SpringWeb
	{
		ModelAndView mav=new ModelAndView();
		
		
		mav.addObject("msg","Welcome to Ashok IT .....!");
		mav.setViewName("message");
		
		return mav;
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {
		
		ModelAndView mav= new  ModelAndView();
		
		mav.addObject("msg",".....Om Sri Sairam.....");
		mav.setViewName("message");
		return mav;
		
	}

}
