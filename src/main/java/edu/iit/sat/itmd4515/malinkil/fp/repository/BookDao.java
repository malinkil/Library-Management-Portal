package edu.iit.sat.itmd4515.malinkil.fp.repository;

import java.util.List;

import edu.iit.sat.itmd4515.malinkil.fp.domain.BookDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.UserTransactionDomain;




public interface BookDao {
	List<BookDomain> getBookByTitle(String title);
	List<BookDomain> getBook();
	List<BookDomain> getAvailableBookByTitle(String title);
	List<BookDomain> getAvailableBook();
	BookDomain getBookById(int id);
	void updateBookDetail(BookDomain bookDomain);
	void issueBook(UserTransactionDomain bookTxn);
}
