//package com.example.bai3.services;
//
//import com.example.bai3.entity.User;
//import com.example.bai3.repository.IUserRepository;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.stream.Collectors;
//
//public class CustomUserDetail implements UserDetails {
//    private final User user;
//    private final IUserRepository userRepository;
//
//    public CustomUserDetail(User user, IUserRepository userRepository){
//        this.user = user;
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities(){
//        return Arrays.stream(userRepository.getRolesOfUser(user.getId()))
//                .map(SimpleGrantedAuthority::new)
//                .collect(Collectors.toSet());
//    }
//
//}
