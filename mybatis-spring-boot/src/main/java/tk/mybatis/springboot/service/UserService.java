package tk.mybatis.springboot.service;

import java.util.List;

import tk.mybatis.springboot.model.User;

public interface UserService {

	/**
	 * 通过 id 查询用户
	 * 
	 * @param id
	 * @return
	 */
	User findById(Long id);

	/**
	 * 查询全部用户
	 * 
	 * @return
	 */
	List<User> findAll();
}
