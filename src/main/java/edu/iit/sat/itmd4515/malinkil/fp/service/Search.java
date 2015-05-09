package edu.iit.sat.itmd4515.malinkil.fp.service;

import java.util.List;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.iit.sat.itmd4515.malinkil.fp.domain.BookDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.UserTransactionDomain;
import edu.iit.sat.itmd4515.malinkil.fp.repository.BookDao;


@Service("search")
public class Search {
	
	@Autowired
	private BookDao bookDao;

	public List<BookDomain> getBookByTitle(String title) {
		return bookDao.getBookByTitle(title);
	}

	public List<BookDomain> getBook() {
		return bookDao.getBook();
	}
	
	public List<BookDomain> getAvailableBookByTitle(String title) {
		return bookDao.getAvailableBookByTitle(title);
	}

	public List<BookDomain> getAvailableBook() {
		return bookDao.getAvailableBook();
	}

	public BookDomain getBookById(int id) {
		return bookDao.getBookById(id);
	}

	
	public void updateBookDetail(BookDomain bookDomain) {
		bookDao.updateBookDetail(bookDomain);
	}
	
	public void issueBook(UserTransactionDomain bookTxn) {
		this.bookDao.issueBook(bookTxn);
	}	
	
}
