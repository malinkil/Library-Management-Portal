package edu.iit.sat.itmd4515.malinkil.fp.web.controller;

import java.util.List;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.iit.sat.itmd4515.malinkil.fp.domain.UserDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.UserTransactionDomain;
import edu.iit.sat.itmd4515.malinkil.fp.manager.UserManager;

@Controller
public class UserController {
	
	@Autowired
	private UserManager UserManager;

	
	@RequestMapping(value = "addUsers.htm", method = RequestMethod.GET)
	public String ereaderCreatePage(HttpServletRequest req, HttpServletResponse res, ModelMap model,
			@RequestParam(value = "addUser", required = false) String addUser){
					
		System.out.println("User Created");	
		return "CreateUser";
	} 
	
	@RequestMapping(value = "addUsers.htm", method = RequestMethod.POST)
	public String processCreatePage(HttpServletRequest req, HttpServletResponse res, ModelMap model,
			@ModelAttribute("userDomain") UserDomain userDomain){
				
		System.out.println(userDomain.getUserName());
		System.out.println("Procees Completed");
		
		UserManager.addUser(userDomain);
		
		return "redirect:viewUser.htm";
	} 
	
	
	
  @RequestMapping(value = "viewUser.htm", method = RequestMethod.GET)
	public String userViewPage(HttpServletRequest req, HttpServletResponse res, ModelMap model){
		
	  	List<UserDomain> userList = UserManager.getAllUsers();
	  	model.addAttribute("userList", userList);		
		return "ViewUser";
	} 
  
  @RequestMapping(value = "editUser.htm", method = RequestMethod.GET)
 	public String userEditPage(HttpServletRequest req, HttpServletResponse res, ModelMap model,
 			@RequestParam(value = "userId", required=false ) String userId){
 		
 	  	UserDomain user = UserManager.getUserByUserId(Integer.parseInt(userId));
 	  	model.addAttribute("user", user);		
 		return "EditUser";
 	} 
  
  @RequestMapping(value = "editUser.htm", method = RequestMethod.POST)
	public String userEditPage(HttpServletRequest req, HttpServletResponse res, ModelMap model,
			@ModelAttribute UserDomain userDomain){		
	  	UserManager.updateUser(userDomain);
		return "redirect:viewUser.htm";
	} 
  
  @RequestMapping(value = "deleteUser.htm", method = RequestMethod.GET)
	public String userDeletePage(HttpServletRequest req, HttpServletResponse res, ModelMap model,
			@RequestParam(value = "userId", required=false ) String userId){
		
	  	UserManager.deleteUser(Integer.parseInt(userId));
		return "redirect:viewUser.htm";
	} 
  
  
  	@RequestMapping(value = "myBooks.htm", method = RequestMethod.GET)
 	public String displayMyBooks(HttpServletRequest req, HttpServletResponse res, ModelMap model, HttpSession session){
  		
  		UserDomain currentUser = (UserDomain) session.getAttribute("currentUser");
  		System.out.println("current :" +currentUser);
  		
  		System.out.println(currentUser.getUserId());
 		
  		List<UserTransactionDomain> myBooks =  UserManager.getBookTransByUserId(currentUser.getUserId());
  		model.addAttribute("myBooks", myBooks);
  		
 		return "ViewMyBooks";
 	} 
   
   
  
}
