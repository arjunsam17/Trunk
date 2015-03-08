package com.chait.bus.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.chait.bus.dao.LoginDao;

public class LoginDaoImpl extends HibernateDaoSupport implements LoginDao,
		UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String arg0)
			throws UsernameNotFoundException {
		System.out.println("Getting access details from employee dao !!");
		
		List<String> roles = new ArrayList<String>(); 
        roles.add("ROLE_USER");
        roles.add("ROLE_ADMIN");
		 
        // Ideally it should be fetched from database and populated instance of
        // #org.springframework.security.core.userdetails.User should be returned from this method
        UserDetails user = new User("chaitu", "chaitu", true, true, true, true, getGrantedAuthorities(roles));
        return user;
	}

	private static List<GrantedAuthority> getGrantedAuthorities (List<String> roles) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for (String role : roles) {
            authorities.add(new SimpleGrantedAuthority(role));
        }
        return authorities;
    }
}

//http://howtodoinjava.com/2013/04/16/custom-userdetailsservice-example-for-spring-3-security/
	