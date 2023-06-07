package com.example.bai3.services;

import com.example.bai3.repository.IRoleRepository;
import com.example.bai3.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bai3.entity.User;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private IRoleRepository roleRepository;
    public void save(User user)
    {
        userRepository.save(user);
        Long userId = userRepository.getUserIdUsername(user.getUsername());
        Long roleId = roleRepository.getRoleIdByName("USER");
        if (roleId != 0 && userId !=0){
            userRepository.addRoleToUser(userId, roleId);
        }
    }
}
