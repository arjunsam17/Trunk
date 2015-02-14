package com.chait.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.chait.dao.UserDataDao;
import com.chait.domain.UserData;

public class UserDataDaoImpl extends HibernateDaoSupport implements UserDataDao {

	public UserData getUserDataById(int id) {
		UserData ud = getHibernateTemplate().get(UserData.class, id);
		return ud;
	}

}
