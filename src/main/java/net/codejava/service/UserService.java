package net.codejava.service;

import javax.validation.Valid;

import net.codejava.Exception.UsernameOrIdNotFound;
import net.codejava.dto.ChangePasswordForm;
import net.codejava.entity.User;

public interface UserService {

	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;
	
	public User getUserById(Long id) throws Exception;
	
	public User updateUser(User user) throws Exception;
	
	public void deleteUser(Long id) throws UsernameOrIdNotFound;
	
	public User changePassword(ChangePasswordForm  form) throws Exception;
	
	
	
	
	
	
}

