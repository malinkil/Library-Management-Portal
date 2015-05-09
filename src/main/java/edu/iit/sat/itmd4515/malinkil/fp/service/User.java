package edu.iit.sat.itmd4515.malinkil.fp.service;

import java.util.List;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.iit.sat.itmd4515.malinkil.fp.domain.MembershipDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.UserDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.UserTransactionDomain;
import edu.iit.sat.itmd4515.malinkil.fp.repository.UserDao;



@Service("user")
public class User {	
	
	@Autowired
	private UserDao userDao;
	
	public void addUser(UserDomain userDomain) throws Exception{		
		userDao.addUser(userDomain);
	}
	
	
	public List<UserDomain> getAllUser() throws Exception{
		return userDao.getAllUsers();
	}
	
	public void deleteUser(int userId) {
		userDao.deleteUser(userId);
	}

	public void updateUser(UserDomain userDomain) {
		userDao.updateUser(userDomain);
	}

	public UserDomain getUserByUserId(int userId) {
		return  userDao.getUserByUserId(userId);
	}

	public UserDomain getUserByUserName(String userName) {
		return userDao.getUserByUserName(userName);
	}

	public MembershipDomain getMembershipById(int id){
		return userDao.getMembershipById(id);
	}
	
	public List<UserTransactionDomain> getBookTransByUserId(int userId){
		return userDao.getBookTransByUserId(userId);
	}
	
}
