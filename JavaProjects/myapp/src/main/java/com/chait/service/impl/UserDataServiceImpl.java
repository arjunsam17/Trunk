package com.chait.service.impl;

import com.chait.dao.UserDataDao;
import com.chait.domain.UserData;
import com.chait.service.UserDataService;

public class UserDataServiceImpl implements UserDataService {

	private UserDataDao userDataDao;
	public UserData getUserDataById(int id) {
		return this.userDataDao.getUserDataById(id);
	}

	public void setUserDataDao(UserDataDao userDataDao) {
		this.userDataDao = userDataDao;
	}

}
