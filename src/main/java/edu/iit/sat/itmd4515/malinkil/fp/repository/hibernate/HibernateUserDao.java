package edu.iit.sat.itmd4515.malinkil.fp.repository.hibernate;



import java.util.List;







import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import edu.iit.sat.itmd4515.malinkil.fp.domain.MembershipDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.UserDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.UserTransactionDomain;
import edu.iit.sat.itmd4515.malinkil.fp.repository.UserDao;


@Repository("userDao")
public class HibernateUserDao extends HibernateDaoSupport implements UserDao {
	
	@Autowired
	 public HibernateUserDao(SessionFactory sessionFactory) {
	  setSessionFactory(sessionFactory);
	 }

	public void addUser(UserDomain userDomain) {		
		 this.getHibernateTemplate().save(userDomain);
	}

	public List<UserDomain> getAllUsers() {
		return this.getHibernateTemplate().find("FROM UserDomain");
	}

	public void deleteUser(int userId) {
		UserDomain user = this.getUserByUserId(userId);
		getHibernateTemplate().delete(user);
		
	}

	public void updateUser(UserDomain userDomain) {
		this.getHibernateTemplate().update(userDomain);
		
	}

	public UserDomain getUserByUserId(int userId) {		
		return this.getHibernateTemplate().get(UserDomain.class, userId);
	}

	public UserDomain getUserByUserName(String userName) {
		List<UserDomain> userList =  this.getHibernateTemplate().find("FROM UserDomain where userName ='"+userName+"'");
		if(userList != null && userList.size() > 0){
			return userList.get(0);
		}
		return null;
	}

	public MembershipDomain getMembershipById(int id) {
		
		return this.getHibernateTemplate().get(MembershipDomain.class, id);
	}
	
	public List<UserTransactionDomain> getBookTransByUserId(int userId) {
		return this.getHibernateTemplate().find("from UserTransactionDomain where user.userId ="+userId);
		
	}


}
