package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;
import entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	public UserDao userDao;

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public User getById(int id) {
		return userDao.getById(id);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
	}
}
