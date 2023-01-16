package com.crudoperation.dao;

import com.crudoperation.entities.User;

public interface UserDAO {

	User getUserById(long userId);

	void addUser(User user);

	void removeUser(User user);

	void updateUser(User user);

	void commitTransaction();

	void beginTransaction();

}
