package com.pfa.labor.service;

import com.pfa.labor.dao.entities.User;
import com.pfa.labor.dto.UserDTO;

import java.util.List;

public interface IUserService {
    void addUser(UserDTO user);

    void updateUser(User user);

    void deleteUser(Long id);

    User findUserByUsername(String username);

    List<User> getAll();
}
