package com.wisdom.user.service;

import java.util.List;
import java.util.Map;

import com.wisdom.common.model.User;
import com.wisdom.common.model.UserRole;

public interface IUserService {

	public Boolean checkUserValidate(String id, String password);
	
	public Boolean addUser(String name, String company);
	
	public Boolean deleteUser(Integer deleteUID);
	
	public List<UserRole>getAllUsersWithRoles();
	
	public List<Map<String, String>>getAllUsers();
}
