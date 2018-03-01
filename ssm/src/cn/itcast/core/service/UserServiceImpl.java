package cn.itcast.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.core.mapper.UserMapper;
import cn.itcast.core.pojo.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void addUser(User user) {
		userMapper.addUser(user);
		
	}

}
