package com.learningsecurity.securityproject.service.impl;

import com.learningsecurity.securityproject.details.CustomUserDetails;
import com.learningsecurity.securityproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;
    private UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        User user = userRepository.getUserByUserName(username);

        if(user == null)
        {
            throw new UsernameNotFoundException("could not find Exception");
        }

        CustomUserDetails customUserDetails = new CustomUserDetails(user);
        return  customUserDetails;
    }
}
