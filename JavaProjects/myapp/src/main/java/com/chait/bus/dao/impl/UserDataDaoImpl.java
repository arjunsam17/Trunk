package com.chait.bus.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.chait.bus.dao.UserDataDao;
import com.chait.bus.domain.UserData;

public class UserDataDaoImpl extends HibernateDaoSupport implements UserDataDao {

	public UserData getUserDataById(int id) {
		UserData ud = getHibernateTemplate().get(UserData.class, id);
		return ud;
	}

	public void createUserData(UserData ud) {
		getHibernateTemplate().save(ud);
		
	}

	public void updateUserDataById(int id) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUserDataById() {
		// TODO Auto-generated method stub
		
	}

}
