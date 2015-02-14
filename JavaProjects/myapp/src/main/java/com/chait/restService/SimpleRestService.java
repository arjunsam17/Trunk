package com.chait.restService;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestService {

	@RequestMapping("/getUserData2.htm")
    public String getSimpleString(@RequestParam(value="userDataId", required=false, defaultValue="1") String id) {
        //Integer intId = Integer.valueOf(id);
    	return "Hello World";
    }
}
