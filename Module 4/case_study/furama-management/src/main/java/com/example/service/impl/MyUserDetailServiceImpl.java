package com.example.service.impl;

import com.example.model.person.MyUserDetail;
import com.example.model.person.Username;
import com.example.repository.login.IUsernameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MyUserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private IUsernameRepository usernameRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Username user = usernameRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Username " + username + " Not exist");
        }
        return new MyUserDetail(user);
    }
}
