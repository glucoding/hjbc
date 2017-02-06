package com.hejiascm.service;

import com.hejiascm.dao.UsersDAO;

import com.hejiascm.domain.Users;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Users entities
 * 
 */

@Service("UsersService")
@Transactional
public class UsersServiceImpl implements UsersService {

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Instantiates a new UsersServiceImpl.
	 *
	 */
	public UsersServiceImpl() {
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@Transactional
	public void deleteUsers(Users users) {
		usersDAO.remove(users);
		usersDAO.flush();
	}

	/**
	 * Return a count of all Users entity
	 * 
	 */
	@Transactional
	public Integer countUserss() {
		return ((Long) usersDAO.createQuerySingleResult("select count(o) from Users o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public Users findUsersByPrimaryKey(String userid) {
		return usersDAO.findUsersByPrimaryKey(userid);
	}

	/**
	 * Load an existing Users entity
	 * 
	 */
	@Transactional
	public Set<Users> loadUserss() {
		return usersDAO.findAllUserss();
	}

	/**
	 * Return all Users entity
	 * 
	 */
	@Transactional
	public List<Users> findAllUserss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Users>(usersDAO.findAllUserss(startResult, maxRows));
	}
	
	/**
     * Return a Users by its name
     */
    @Transactional
    public Users findUserByUserName(String username){
      return (Users)usersDAO.findUsersByUsername(username);
    }

	/**
	 * Save an existing Users entity
	 * 
	 */
	@Transactional
	public void saveUsers(Users users) {
		Users existingUsers = usersDAO.findUsersByPrimaryKey(users.getUserid());

		if (existingUsers != null) {
			if (existingUsers != users) {
				existingUsers.setUserid(users.getUserid());
				existingUsers.setUsername(users.getUsername());
				existingUsers.setPassword(users.getPassword());
				existingUsers.setPasssalt(users.getPasssalt());
				existingUsers.setEnabled(users.getEnabled());
				existingUsers.setOrgid(users.getOrgid());
			}
			users = usersDAO.store(existingUsers);
		} else {
			users = usersDAO.store(users);
		}
		usersDAO.flush();
	}
}
