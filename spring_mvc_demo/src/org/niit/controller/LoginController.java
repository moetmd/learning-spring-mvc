package org.niit.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.niit.dao.UserDAO;
import org.niit.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {

	@Resource(name="userdao")
	private UserDAO dao;
	
	@RequestMapping("/login.do")
	public String testLogin(String username,String password,
			HttpServletRequest request){
		if("xf".equals(username) && "123".equals(password)){
			return "success";
		}
		return "error";
		//     /jsp/success.jsp        /jsp/error.jsp
	}
	
	@RequestMapping("/login2.do")
	public String testLogin2(User user){
		if(user!=null && "xf".equals(user.getName())){
			return "redirect:/jsp/success.jsp";
		}
		
		return "redirect:/jsp/error.jsp";
		
	}
	
	
	@RequestMapping("/login3.do")
	public ModelAndView testLogin3(String username,String password,
			HttpServletRequest request){
		
		System.out.println("dao="+dao);
		
		if("xf".equals(username) && "123".equals(password)){
			
			System.out.println(dao.findAll());
			request.setAttribute("userlist", dao.findAll());
			return new ModelAndView("success");
			
		}
		
			return new ModelAndView("error");
		
	}
	
	/*
	 * 
	 * 页面转发
	 * return new ModelAndView("loginError"); 
	 * 
	 * 重定向
	 * return new ModelAndView(new RedirectView("../index.jsp"));
	 * 还有一种简单写法
	 * return new ModelAndView("redirect:../index.jsp");
	 */
	
}
