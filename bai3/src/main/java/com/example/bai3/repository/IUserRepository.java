package com.example.bai3.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.bai3.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {

    @Query ("SELECT u FROM User u WHERE u.username=?1")
    User findByUsername(String username);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO user_role (user id, role_id)" +
            "VALUES (?1, ?2)", nativeQuery = true)
    void addRoleToUser (Long userId, Long roleId);

    @Query("SELECT u.id FROM User WHERE u.username = ?1")
    Long getUserIdUsername (String username);
    String[]getRolesOfUser (Long userId);

}