package model.service;

import model.User;
import model.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUser();
    void addUser(User user);
    void deleteUser(Integer id);
}
