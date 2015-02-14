package com.chait.restService;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chait.dao.UserDataDao;
import com.chait.domain.UserData;

@RestController
public class UserDataRestService {

	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private UserDataDao userDataDao;

    public void setUserDataDao(UserDataDao userDataDao) {
		this.userDataDao = userDataDao;
	}

	//@RequestMapping("/getUserData.htm")
    //public UserData greeting(@RequestParam(value="userDataId", required=false, defaultValue="1") String id) {
	@RequestMapping(value = "/getUserData.json", headers="Accept=*/*", method=RequestMethod.GET)
	  public @ResponseBody UserData getConversion(){
//        Integer intId = Integer.valueOf(id);
		Integer intId = 1;
        UserData userData = userDataDao.getUserDataById(intId);
    	return userData;
//        return "{\"user_data_id\":1,\"user_data_pwd\":\"123\"}";
    }
}
