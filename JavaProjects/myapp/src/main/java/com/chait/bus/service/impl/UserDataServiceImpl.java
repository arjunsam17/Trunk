package com.chait.bus.service.impl;

import com.chait.bus.dao.UserDataDao;
import com.chait.bus.domain.UserData;
import com.chait.bus.service.UserDataService;

public class UserDataServiceImpl implements UserDataService {

	private UserDataDao userDataDao;
	public UserData getUserDataById(int id) {
		return this.userDataDao.getUserDataById(id);
	}

	public void setUserDataDao(UserDataDao userDataDao) {
		this.userDataDao = userDataDao;
	}

}
