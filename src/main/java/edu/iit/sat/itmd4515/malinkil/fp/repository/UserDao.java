package edu.iit.sat.itmd4515.malinkil.fp.repository;


import java.util.List;

import edu.iit.sat.itmd4515.malinkil.fp.domain.MembershipDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.UserDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.UserTransactionDomain;



public interface UserDao {
	void addUser(UserDomain userDomain);
	List<UserDomain> getAllUsers();
	void deleteUser(int userId);
	void updateUser(UserDomain userDomain);
	UserDomain getUserByUserId(int userId);
	UserDomain getUserByUserName(String userName);
	MembershipDomain getMembershipById(int id);
	List<UserTransactionDomain> getBookTransByUserId(int userId);

}
