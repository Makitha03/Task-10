package org.user.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.user.app.model.User;
import org.user.app.repository.UserRepository;

@Service
public class UserServiceImplemenetation implements UserService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	

	@Override
	public User adduser(User user) {
		
		return this.userRepository.save(user);
	}


	@Override
	public List<User> getUsers() {
		
		return this.userRepository.findAll();
	}

	

}
