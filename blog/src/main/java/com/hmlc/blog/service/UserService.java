package com.hmlc.blog.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hmlc.blog.entity.User;
import com.hmlc.blog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.QualifierAnnotationAutowireCandidateResolver;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User FindByEmail(String email){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("email",email);
        User yonghuxinxi = userMapper.selectOne(queryWrapper);
        return yonghuxinxi;
    }

    public Map<String ,Object>
}
