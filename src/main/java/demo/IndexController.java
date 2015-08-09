package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController 
{
	@RequestMapping("/index")
	public ModelAndView index()
	{
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
}
