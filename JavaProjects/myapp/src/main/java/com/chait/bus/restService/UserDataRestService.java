package com.chait.bus.restService;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chait.bus.dao.UserDataDao;
import com.chait.bus.domain.UserData;

@RestController
public class UserDataRestService {

	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private UserDataDao userDataDao;

    public void setUserDataDao(UserDataDao userDataDao) {
		this.userDataDao = userDataDao;
	}

	@RequestMapping(value = "/userData", headers="Accept=*/*", method=RequestMethod.GET)
	  public @ResponseBody UserData getUserData(){
		Integer intId = 1;
        UserData userData = userDataDao.getUserDataById(intId);
    	return userData;
    }
	
	@RequestMapping(value = "/userData", headers="Accept=*/*", method=RequestMethod.POST)
	  public @ResponseBody UserData createUserData(){
	  Integer intId = 1;
      UserData userData = userDataDao.getUserDataById(intId);
  	return userData;
  }

}
