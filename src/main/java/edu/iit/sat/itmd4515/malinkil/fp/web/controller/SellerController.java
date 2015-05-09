package edu.iit.sat.itmd4515.malinkil.fp.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.iit.sat.itmd4515.malinkil.fp.domain.BookDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.BookPurchaseDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.SellerDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.SellerPurchaseDomain;
import edu.iit.sat.itmd4515.malinkil.fp.manager.SellerManager;


@Controller
public class SellerController {
	
	@Autowired
	SellerManager sellerManager;
	
	@RequestMapping(value = "createSeller.htm", method = RequestMethod.GET)
	public String userCreatePage(HttpServletRequest req, HttpServletResponse res, ModelMap model,
			@RequestParam(value = "createSeller", required = false) String addUser){
					
		System.out.println("Seller Created");	
		return "CreateSeller";
	} 
	
	@RequestMapping(value = "addSeller.htm", method = RequestMethod.POST)
	public String processCreatePage(HttpServletRequest req, HttpServletResponse res, ModelMap model,
			@ModelAttribute("sellerDomain") SellerDomain sellerDomain){
			System.out.println("Seller Added");	
						
		sellerManager.addSeller(sellerDomain);
		
		return "redirect:viewSeller.htm";
	} 
	 @RequestMapping(value = "viewSeller.htm", method = RequestMethod.GET)
		public String userViewPage(HttpServletRequest req, HttpServletResponse res, ModelMap model){
			
		  	List<SellerDomain> sellerList = sellerManager.getSellers();
		  	
		  	System.out.println("list size:"+sellerList.size());
		  	model.addAttribute("sellerList", sellerList);		
			return "ViewSeller";
		} 
	 @RequestMapping(value = "editSeller.htm", method = RequestMethod.GET)
	 	public String userEditPage(HttpServletRequest req, HttpServletResponse res, ModelMap model,
	 			@RequestParam(value = "sellerId", required=false ) String sellerId){
	 		
	 	  	SellerDomain seller = sellerManager.getSellerBySellerId(Integer.parseInt(sellerId));
	 	  	model.addAttribute("seller", seller);		
	 		return "EditSeller";
	 	} 

	 @RequestMapping(value = "editSeller.htm", method = RequestMethod.POST)
		public String userEditPage(HttpServletRequest req, HttpServletResponse res, ModelMap model,
				@ModelAttribute SellerDomain sellerDomain){		
		 sellerManager.updateSeller(sellerDomain);;
			return "redirect:viewSeller.htm";
		} 
	 
	 @RequestMapping(value = "deleteSeller.htm", method = RequestMethod.GET)
		public String userDeletePage(HttpServletRequest req, HttpServletResponse res, ModelMap model,
				@RequestParam(value = "sellerId", required=false ) String sellerId){
			
		 sellerManager.deleteSeller(Integer.parseInt(sellerId));
			return "redirect:viewSeller.htm";
		} 
	  
	 @RequestMapping(value = "createOrder.htm", method = RequestMethod.GET)
		public String purchaseCreatePage(HttpServletRequest req, HttpServletResponse res, ModelMap model){
						
			List<SellerDomain> sellerList = sellerManager.getSellers();
			model.addAttribute("sellerList", sellerList);		
			
			return "AddBook";
		} 
		
		
		@RequestMapping(value = "createOrder.htm", method = RequestMethod.POST)
		public String purchaseProcessPage(HttpServletRequest req, HttpServletResponse res, ModelMap model,
				@ModelAttribute BookPurchaseDomain pDomain){
						
			SellerPurchaseDomain sp = new SellerPurchaseDomain();
			sp.setSellerId(pDomain.getSellerId());
			
			SimpleDateFormat date = new SimpleDateFormat("dd-mm-yyyy");		
			sp.setPurchaseDate(date.format(new Date()));
			
			sp.setQuantity(pDomain.getQuantity());
			
			int qant = pDomain.getQuantity();
			
			Set<BookDomain> bookList = new HashSet<BookDomain>();
			
			for(int i=0; i < qant; i++){			
				BookDomain book =	new BookDomain();			
				book.setAuthor(pDomain.getAuthor());
				book.setCategory(pDomain.getCategory());
				book.setTitle(pDomain.getTitle());
				book.setVersion(pDomain.getVersion());
				book.setAvailable(true);
				bookList.add(book);
			}
			
			sp.setBookList(bookList);
			
			System.out.println(bookList.size());
			
			sellerManager.purchaseBook(sp);
			
			return "redirect:home.htm";
		} 
		
		
}
