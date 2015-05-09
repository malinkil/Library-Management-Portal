package edu.iit.sat.itmd4515.malinkil.fp.web.controller;

import java.util.List;





import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.iit.sat.itmd4515.malinkil.fp.domain.BookDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.UserDomain;
import edu.iit.sat.itmd4515.malinkil.fp.manager.SearchManager;


@Controller
public class SearchController {
	
	@Autowired
	private SearchManager searchManager;
	
	@RequestMapping(value = "searchBook.htm", method = RequestMethod.GET)
	public String loadSearchPage(HttpServletRequest req, HttpServletResponse res, ModelMap model){					
		
		return "SearchBook";
	} 
	
	@RequestMapping(value = "searchBook.htm", method = RequestMethod.POST)
	public String processSearchPage(HttpServletRequest req, HttpServletResponse res, ModelMap model,
			@RequestParam(value = "title", required=false ) String title){	
		
		List<BookDomain> bookList = searchManager.getAvailableBookByTitle(title);
		model.addAttribute("bookList", bookList);
		
		return "SearchBookResult";
	} 
	
	@RequestMapping(value = "issueBook.htm", method = RequestMethod.POST)
	public String processIssueBook(HttpServletRequest req, HttpServletResponse res, ModelMap model,
			HttpSession session,
			@RequestParam(value = "bookId", required=false ) Integer bookId){	
		
		UserDomain currentUser = (UserDomain) session.getAttribute("currentUser");
		System.out.println("issueBook"+bookId);
		
		searchManager.issueBookForUser(currentUser, bookId);		
		
		return "redirect:myBooks.htm?userId="+currentUser.getUserId();
	} 


}
