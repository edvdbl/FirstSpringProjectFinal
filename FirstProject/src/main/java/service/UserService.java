package service;

import java.util.List;

import entity.User;

public interface UserService {
	
	List<User> getAll();
	
	void save(User user);
	
	User getById(int id);
	
	void update(User user);
	
	void delete (int id);

}
