package tk.mybatis.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.mybatis.springboot.mapper.UserMapper;
import tk.mybatis.springboot.model.User;
import tk.mybatis.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User findById(Long id) {
		return userMapper.selectById(id);
	}
	
	@Override
	public List<User> findAll() {
		return userMapper.selectAll();
	}
	
}
