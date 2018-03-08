package spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	@RequestMapping("/register.do")
	public String showRegister(){
		System.out.println("showRegister.do");
		return "register";
	}
	@RequestMapping(value="/handler_register.do",method=RequestMethod.POST)
//	public String handlerRegister(HttpServletRequest request){
//		String username=request.getParameter("username");
//		String password=request.getParameter("password");
//		
//		System.out.println("handler_register.do");
//		System.out.println("username+"+username);
//		System.out.println("password+"+password);
//		return null;
//	}
	public String handlerRegister(User user){
		System.out.println(user);
		
		return "redirect:login.do";
	}
	
	@RequestMapping("/login.do")
	public String showLogin(){
		System.out.println("showLogin.do");
		return "Login";
	}
	@RequestMapping(value="/handler_Login.do",method=RequestMethod.POST)
	public String loginController(String username,String password,ModelMap modelMap){
		System.out.println("username+"+username);
		System.out.println("password+"+password);
		
		if("admin".equals(username)){
			if("111".equals(password)){
				return "success";
			}else{
				modelMap.addAttribute("errorMessage","密码不匹配");
				return "error";
			}
		}else{
			modelMap.addAttribute("errorMessage","用户名不存在");
			return "error";
		}
			
		
	}
	}
		
	
	
	
