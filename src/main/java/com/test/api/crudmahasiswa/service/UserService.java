package com.test.api.crudmahasiswa.service;

import com.test.api.crudmahasiswa.dtos.UserDto;
import com.test.api.crudmahasiswa.models.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
