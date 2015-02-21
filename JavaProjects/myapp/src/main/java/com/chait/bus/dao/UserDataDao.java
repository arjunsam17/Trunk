package com.chait.bus.dao;

import com.chait.bus.domain.UserData;

public interface UserDataDao {

	UserData getUserDataById(int id);
	void createUserData(UserData ud);
	void updateUserDataById(int id);
	void deleteUserDataById();
}
