package com.pfa.labor.dao.repositories;


import com.pfa.labor.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;

public interface IUserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
