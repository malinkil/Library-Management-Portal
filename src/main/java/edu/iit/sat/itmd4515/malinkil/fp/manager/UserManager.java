package edu.iit.sat.itmd4515.malinkil.fp.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.iit.sat.itmd4515.malinkil.fp.domain.UserDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.UserTransactionDomain;
import edu.iit.sat.itmd4515.malinkil.fp.service.User;


@Component("userManager")
public class UserManager {
	
	@Autowired
	private User user;
	
	public void addUser(UserDomain userDomain){		
		try{
			user.addUser(userDomain);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	public List<UserDomain> getAllUsers(){
		List<UserDomain> userList = new ArrayList<UserDomain>();
		try{
			userList = user.getAllUser();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return userList;
	}
	
	
	public void deleteUser(int userId) {
		user.deleteUser(userId);
	}

	public void updateUser(UserDomain userDomain) {
		user.updateUser(userDomain);
	}

	public UserDomain getUserByUserId(int userId) {
		return  user.getUserByUserId(userId);
	}

	public UserDomain getUserByUserName(String userName) {
		return user.getUserByUserName(userName);
	}
	

	public List<UserTransactionDomain> getBookTransByUserId(int userId){
		return user.getBookTransByUserId(userId);
	}
	

}
