package com.learing.auth.auth.Service;

import com.learing.auth.auth.Model.UserPrincipal;
import com.learing.auth.auth.Model.Users;
import com.learing.auth.auth.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = userRepo.findByUsername(username);

        if(user == null) {
            System.out.println("User Not found!!!");
            throw new UsernameNotFoundException("User Not found!!!");
        }

        return new UserPrincipal(user);
    }
}
