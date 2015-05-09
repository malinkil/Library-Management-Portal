package edu.iit.sat.itmd4515.malinkil.fp.repository.hibernate;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import edu.iit.sat.itmd4515.malinkil.fp.domain.BookDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.UserTransactionDomain;
import edu.iit.sat.itmd4515.malinkil.fp.repository.BookDao;

@Repository("bookDao")
public class HibernateBookDao extends HibernateDaoSupport implements BookDao {
	
	@Autowired
	 public HibernateBookDao(SessionFactory sessionFactory) {
	  setSessionFactory(sessionFactory);
	 }

	public List<BookDomain> getBookByTitle(String title) {
		return this.getHibernateTemplate().find("from BookDomain where title ='"+title+"'");
	}

	public List<BookDomain> getBook() {
		return this.getHibernateTemplate().find("from BookDomain");
	}

	public BookDomain getBookById(int id) {
		return getHibernateTemplate().get(BookDomain.class, id);
	}

	public void updateBookDetail(BookDomain bookDomain) {
		this.getHibernateTemplate().update(bookDomain);
	}

	public List<BookDomain> getAvailableBookByTitle(String title) {
		return this.getHibernateTemplate().find("from BookDomain where  isAvailable = true AND title = '"+title+"'");

	}

	public List<BookDomain> getAvailableBook() {
		return this.getHibernateTemplate().find("from BookDomain where  isAvailable = true " );
	}

	public void issueBook(UserTransactionDomain bookTxn) {
		this.getHibernateTemplate().save(bookTxn);
	}


	
	
}
