package edu.iit.sat.itmd4515.malinkil.fp.manager;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.iit.sat.itmd4515.malinkil.fp.domain.BookDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.MembershipDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.UserDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.UserTransactionDomain;
import edu.iit.sat.itmd4515.malinkil.fp.service.Search;
import edu.iit.sat.itmd4515.malinkil.fp.service.User;



@Component("searchManager")
public class SearchManager {
	
	@Autowired
	private Search search;
	
	@Autowired
	private User user;

	public List<BookDomain> getBookByTitle(String title) {
		return search.getBookByTitle(title);
	}

	public List<BookDomain> getBook() {
		return search.getBook();
	}

	public BookDomain getBookById(int id) {
		return search.getBookById(id);
	}

	public List<BookDomain> getAvailableBookByTitle(String title) {
		return search.getAvailableBookByTitle(title);
	}

	public List<BookDomain> getAvailableBook() {
		return search.getAvailableBook();
	}
	public void updateBookDetail(BookDomain bookDomain) {
		search.updateBookDetail(bookDomain);
	}
	
	public void issueBookForUser(UserDomain currentUser, int bookId){
		MembershipDomain member = user.getMembershipById(currentUser.getMembershipId());
		BookDomain book = search.getBookById(bookId);
		System.out.println("Book"+book.getAuthor());
		Date startDate = new Date();		
		
		Calendar cal  = Calendar.getInstance();
		cal.setTime(startDate);
		cal.add(Calendar.DATE, member.getDue());
		Date returnDate = cal.getTime();
		
		UserTransactionDomain bookTxn = new UserTransactionDomain();
		book.setAvailable(false);
		bookTxn.setBook(book);
		bookTxn.setStartDate(startDate);
		bookTxn.setReturnDate(returnDate);
		bookTxn.setUser(currentUser);			
		
		search.issueBook(bookTxn);
		
	}

}
