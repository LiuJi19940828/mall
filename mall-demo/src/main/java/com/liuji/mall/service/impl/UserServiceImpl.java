package com.liuji.mall.service.impl;

import com.liuji.mall.config.jwt.JWTUtils;
import com.liuji.mall.dao.UserCustomMapper;
import com.liuji.mall.mbg.mapper.UserMapper;
import com.liuji.mall.mbg.model.User;
import com.liuji.mall.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private UserCustomMapper userCustomMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JWTUtils jwtUtils;

    @Override
    public User getUserByUsername(String username) {
        return userCustomMapper.selectByUsername(username);
    }

    @Override
    public User register(User user) {
        User newUser = new User();
        BeanUtils.copyProperties(user, newUser);
        newUser.setCreateTime(new Date());
        newUser.setStatus(1);
        User sameUser = userCustomMapper.selectByUsername(user.getUsername());
        if (sameUser != null) return null;
        newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));
        userMapper.insert(newUser);
        return newUser;
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        try {
            UserDetails userDetail = userDetailsService.loadUserByUsername(username);
            if (!passwordEncoder.matches(password, userDetail.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetail, null, userDetail.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            token = jwtUtils.generateToken(userDetail);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return token;
    }
}
